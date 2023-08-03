package com.example.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        //Reverse only works with list.
        List<Integer> list1 = Arrays.asList(3, 8, 5, 1, 7, 9);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
