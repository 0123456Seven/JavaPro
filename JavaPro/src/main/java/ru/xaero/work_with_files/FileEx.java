package ru.xaero.work_with_files;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("file2.txt");
        File folder = new File("A");
        File folder2 = new File("A2");
        File file2 = new File("file234");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("===========================");
        System.out.println(file.isAbsolute());
        System.out.println("===========================");
        System.out.println(file.isDirectory());
        System.out.println("===========================");
        System.out.println(file.exists());
        System.out.println("===========================");
        System.out.println(file2.createNewFile());
        System.out.println(folder2.mkdir());
        System.out.println("===========================");
        System.out.println(file.length());
        System.out.println("===========================");
        System.out.println(file2.delete());
        System.out.println(folder2.delete());
        System.out.println("===========================");
        System.out.println("===========================");

    }
}
