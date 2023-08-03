package com.example.frequency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 6,2, 4, 1,6,2,5);
        System.out.println(list1);
        int freq1 = Collections.frequency(list1, 2);
        System.out.println(freq1);

        Integer[] arr= {10, 20, 20, 30, 20, 40, 50};
        List<Integer> list2 = List.of(arr);
        int freq2 = Collections.frequency(list2, 20);
        System.out.println(freq2);
    }
}
