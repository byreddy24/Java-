package com.example.demo;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> list= new LinkedList<>();
        list.add("venky");
        list.remove("venky");
        System.out.println(list);
    }
}
