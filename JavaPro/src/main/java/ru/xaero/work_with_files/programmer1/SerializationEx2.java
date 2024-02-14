package ru.xaero.work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Marsel","IT", 21, 1000);
        Car car = new Car("BMW", "RED");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))){
            outputStream.writeObject(employee);
            outputStream.writeObject(car);
            System.out.println("DONE!");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
