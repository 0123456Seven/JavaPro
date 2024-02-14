package ru.xaero.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccesFile {
    public static void main(String[] args){
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")){
            int a = file.read();
            System.out.println((char)a);
            a = file.read();
            System.out.println((char)a);
            String s1 = file.readLine();
            System.out.println(s1);
            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);
            System.out.println(file.getFilePointer());
            file.seek(0);
            file.seek(file.length());
            file.writeBytes("\n\t\t\t\t\t\t\t\tauthor: William Butler Yeats");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
