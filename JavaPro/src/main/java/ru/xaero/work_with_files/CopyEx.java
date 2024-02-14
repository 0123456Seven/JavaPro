package ru.xaero.work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args){
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открывая мной.\n";
        try(BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt", true));){

            String line;
            while((line=reader.readLine())!=null){
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("DONE!");
        }
        catch (IOException e){
            e.printStackTrace();
        }




    }
}

