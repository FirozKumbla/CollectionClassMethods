package com.example.rotate;

import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        //Rotate only works with list.
        List<Integer> list1 = Arrays.asList(2, 8, 4,1,5, 9, 0, 3);
        System.out.println(list1);
        Collections.rotate(list1, 2);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("John", "David", "Anil", "Shaji");
        System.out.println(list2);
        Collections.rotate(list2, 3);
        System.out.println(list2);
    }
}
