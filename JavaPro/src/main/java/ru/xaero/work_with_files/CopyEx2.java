package ru.xaero.work_with_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try(
                FileInputStream inputStream = new FileInputStream("C:\\Users\\0123456Seven\\Downloads\\166129-california_streaming_apple_event_wallpaper_without_logo-1920x1080.jpg");
                FileOutputStream outputStream = new FileOutputStream("nature.jpg")
                ){
            int i;
            while((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
