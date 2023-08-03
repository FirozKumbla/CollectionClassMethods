package com.example.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Spring");
        list1.add("Mysql");
        list1.add("Python");
        list1.add("Redis");

        System.out.println(list1);
        Collections.shuffle(list1, new Random(6));
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
