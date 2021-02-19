package javaFX.autoStartMedia;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public Label systemMessage = new Label();
    public Label timeExample = new Label("Format: hour.minute.sec \n Example: 10.45.00");
    public TextField newTimeInput = new TextField();
    FileChooser fc = new FileChooser();
    String path = null;
    public List<String> tracksList = new ArrayList<>();
    public List<String> timesList = new ArrayList<>();
    ObservableList data = null;
    // Create the ListView
    public ListView<String> tracksView = new ListView<>();
    public ListView<String> timesView = new ListView<>();
    public CheckBox repeat = new CheckBox();
    public CheckBox shuffle = new CheckBox();

    Media media = null;
    MediaPlayer player = null;
    public MediaView mediaView = new MediaView();

    @FXML
    public void selectTrack(){
        String selectedItem = tracksView.getSelectionModel().getSelectedItem();
        int index = tracksView.getSelectionModel().getSelectedIndex();
        path = selectedItem;
        systemMessage.setText("Item selected : " + selectedItem + ", Item index : " + index);
        tracksView.setEditable(true);
        tracksView.setCellFactory(TextFieldListCell.forListView());
    }

    @FXML
    public void selectTime(){
        String selectedItem = timesView.getSelectionModel().getSelectedItem();
        int index = timesView.getSelectionModel().getSelectedIndex();
        path = selectedItem;
        systemMessage.setText("Item selected : " + selectedItem + ", Item index : " + index);
        timesView.setEditable(true);
        timesView.setCellFactory(TextFieldListCell.forListView());
    }

    @FXML
    public void timeInput(){
        String timeData = newTimeInput.getText();
        systemMessage.setText(path);

        //add new track
        ObservableList<String> timelist = FXCollections.observableArrayList(timeData);
        timesView.setEditable(true);
        // Add the items to the List
        timesView.getItems().addAll(timelist);

    }

    @FXML
    public void loadTracks(){
        tracksView.getItems().clear();
        tracksList.clear();
        try {
            Scanner in = new Scanner(new File("src/javaFX/autoStartMedia/savedTracklist.txt"));
            while(in.hasNext()) {
                tracksList.add(in.nextLine());
            }
            path = tracksList.get(0);
        }catch(FileNotFoundException fnf){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("WoW! Exception!");
            alert.setContentText("File not found!");

            alert.showAndWait();
        }
        systemMessage.setText(tracksList.toString());

        ObservableList<String> tracklist = FXCollections.observableArrayList(tracksList);
        tracksView.setEditable(true);
        // Add the items to the List
        tracksView.getItems().addAll(tracklist);
    }
    @FXML
    public void saveTracks(){
        tracksList.clear();
        tracksList.addAll(tracksView.getItems());
        systemMessage.setText(tracksList.toString());
        try {
            Path out = Paths.get("src/javaFX/autoStartMedia/savedTracklist.txt");
            Files.write(out,tracksList, Charset.defaultCharset());

        }catch(IOException e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("WoW! Exception!");
            alert.setContentText("File not found!");

            alert.showAndWait();
        }finally {
            tracksList.clear();
        }
    }

    @FXML
    public void loadTime(){
        timesView.getItems().clear();
        timesList.clear();
        try {
            Scanner in = new Scanner(new File("src/javaFX/autoStartMedia/savedTimeList.txt"));
            while(in.hasNext()) {
                timesList.add(in.nextLine());
            }
        }catch(FileNotFoundException fnf){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("WoW! Exception!");
            alert.setContentText("File not found!");
            alert.showAndWait();
        }
        systemMessage.setText(timesList.toString());

        ObservableList<String> timeList = FXCollections.observableArrayList(timesList);
        timesView.setEditable(true);
        // Add the items to the List
        timesView.getItems().addAll(timeList);
    }

    @FXML
    public void saveTime(){
        timesList.clear();
        timesList.addAll(timesView.getItems());
        systemMessage.setText(timesList.toString());
        try {
            Path out = Paths.get("src/javaFX/autoStartMedia/savedTimelist.txt");
            Files.write(out,timesList, Charset.defaultCharset());

        }catch(IOException e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("WoW! Exception!");
            alert.setContentText("File not found!");

            alert.showAndWait();
        }finally {
            timesList.clear();
        }
    }

    @FXML
    public void stop(){
        if (player != null) {
            player.stop();
            systemMessage.setText("Player stopped");
            //player.dispose();
        }
    }
    @FXML
    public void play(){
        //set last track to player
        if (player != null) {
            player.stop();
        }
        try{
            media = new Media(new File(path).toURI().toString());
            player = new MediaPlayer(media);
            if(repeat.isSelected()) {
                player.setAutoPlay(true);
                player.setCycleCount(MediaPlayer.INDEFINITE);
                //player.setOnEndOfMedia(()-> player.seek(Duration.ZERO));
                systemMessage.setText("AutoPlay selected");
            }else{
                player.setAutoPlay(false);
                player.setCycleCount(1);
            }
            mediaView.setMediaPlayer(player);
            // Play the media when button 'play' pressed
            player.play();
        }catch (RuntimeException re){
            systemMessage.setText("Load tracks!");
        }
    }
    @FXML
    public void addTrack(){
        File file = fc.showOpenDialog(null);
        String fileName = file.getName();
        path = "D:/" + fileName;
        path = path.replace("\\", "/");

        //path of file chosen
        systemMessage.setText(path);

        //add new track
        ObservableList<String> tracklist = FXCollections.observableArrayList(path);
        tracksView.setEditable(true);
        // Add the items to the List
        tracksView.getItems().addAll(tracklist);
    }
}
