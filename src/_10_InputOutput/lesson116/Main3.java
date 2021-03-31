package _10_InputOutput.lesson116;

import java.io.IOException;
import java.nio.file.*;

public class Main3 {
    public static void main(String[] args) {
        String pathToDir = "D:\\Games";
        Path p = Paths.get(pathToDir);
        WatchService ws = null;
        try{
            ws = p.getFileSystem().newWatchService();
            p.register(ws, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (;;){
            WatchKey key = null;
            try{
                key = ws.take();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            for (WatchEvent event: key.pollEvents()){
                switch(event.kind().name()){
                    case "OVERFLOW":
                        System.out.println("We lost some events");
                        break;
                    case "ENTRY_CREATE":
                        System.out.println("File " + event.context() + " is created!");
                        break;
                    case "ENTRY_MODIFY":
                        System.out.println("File " + event.context() + " is modified!");
                        break;
                    case "ENTRY_DELETE":
                        System.out.println("File " + event.context() + " is deleted!");
                        break;
                }
            }
            key.reset();
        }
    }
}