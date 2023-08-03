package com.example.max;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7,4,1,3,64,56,7,3);
        int max = Collections.max(list1);
        System.out.println(max);

        //min using max
        int min = Collections.max(list1, Comparator.reverseOrder());
        System.out.println(min);

    }
}
