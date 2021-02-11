package javaFX.autoStartMedia;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.ArrayList;

public class Controller {
    FileChooser fc = new FileChooser();
    String path = null;
    ArrayList<String> tracks = new ArrayList<String>();
    ObservableList data = null;
    ListView lv = null;


    Media media = null;
    MediaPlayer player = null;
    MediaView mediaView = new MediaView();
    @FXML
    public void loadTracks(){
        // replace this with your own audio file
    }
    @FXML
    public void play(){
        // Play the media when button 'play' pressed
        player.play();
    }
    @FXML
    public void chooseFile(){
        File file = fc.showOpenDialog(null);
        String fileName = file.getName();
        System.out.println(fileName);
        path = "D:/" + fileName;
        //path = file.getAbsolutePath();

        path = path.replace("\\", "/");

        tracks.add(path);
        data = FXCollections.observableArrayList(tracks);
        lv = new ListView(data);
        lv.setItems(data);
        media = new Media(new File(path).toURI().toString());

        player = new MediaPlayer(media);
        player.stop();
        //player.setAutoPlay(true);
        mediaView.setMediaPlayer(player);
    }
}
