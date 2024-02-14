package ru.xaero.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открывая мной.\n";
        String hello = "Hello!";
        try (FileWriter  writer = new FileWriter("file.txt", true)){
            writer.write(hello);
            System.out.println("DONE!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
