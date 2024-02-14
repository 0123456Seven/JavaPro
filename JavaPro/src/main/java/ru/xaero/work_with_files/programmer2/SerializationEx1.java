package ru.xaero.work_with_files.programmer2;

import ru.xaero.work_with_files.programmer1.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees;
        Employee employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))){
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
            System.out.println("DONE!");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
