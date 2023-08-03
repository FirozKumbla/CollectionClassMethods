package com.example.min;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(9, 4, 2, 7, 3, 5);
        System.out.println(list1);
        int min1 = Collections.min(list1);
        System.out.println("Minimum value is: " +min1);

        //max using min
        int max = Collections.min(list1, Collections.reverseOrder());
        System.out.println(max);

        List<Integer> list2 = new ArrayList<>();
        int  min2 = Collections.min(list2); //will give NoSuchElementException, as list2 is empty
        System.out.println(min2);
    }
}
