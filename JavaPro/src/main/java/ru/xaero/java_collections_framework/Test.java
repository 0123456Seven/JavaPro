package ru.xaero.java_collections_framework;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<10; i++){
            list.add(i);
        }
        System.out.println(list);

        System.out.println(list.get(list.size()-1));
        System.out.println(list.size());
        for(Integer i : list){
            System.out.print(i+",");
        }
        list.remove(5);
        System.out.println();
        for(Integer i : list){
            System.out.print(i+",");
        }
    }
}
