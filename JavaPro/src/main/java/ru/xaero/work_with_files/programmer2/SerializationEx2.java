package ru.xaero.work_with_files.programmer2;

import ru.xaero.work_with_files.programmer1.Car;
import ru.xaero.work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee;
        Car car;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))){
            employee = (Employee) inputStream.readObject();
            car = (Car) inputStream.readObject();
            System.out.println(employee);
            System.out.println(car);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
