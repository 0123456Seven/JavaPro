package ru.xaero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("wefwf");
        Scanner scan = new Scanner(file);
    }
}