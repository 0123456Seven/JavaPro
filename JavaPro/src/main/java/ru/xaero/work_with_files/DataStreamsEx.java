package ru.xaero.work_with_files;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))
        ){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(2342);
            outputStream.writeLong(23423422);
            outputStream.writeFloat(23.24f);
            outputStream.writeDouble(234.23);
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
