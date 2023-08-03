package com.example.disjoint;

import java.util.*;


public class Disjoint {
    public static void main(String[] args) {
        //Two collections are disjoint if they have no elements in common.
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("how");

        List<String> list2 = new Vector<>();
        list2.add("how");
        list2.add("are");
        list2.add("you");

        Set<Integer> set = new HashSet<>();
        set.add(56);
        set.add(51);

        System.out.println(Collections.disjoint(list1, set));
        System.out.println(Collections.disjoint(list1, list2));
        System.out.println(Collections.disjoint(set, list2));

        // Let us create  arrays of integers
        Integer[] arr1 = {10, 20, 30, 40, 50};
        Integer[] arr2 = {60, 70, 80, 90, 100};
        Integer[] arr3 = {50, 70, 80, 90, 100};
        Double[] arr4 = {50.0, 60.0, 110.0};
        System.out.println("is arr1 disjoint to arr2 : " +
                Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2)));

        System.out.println("is arr1 disjoint to arr3 : " +
                Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr3)));

        System.out.println("is arr1 disjoint to arr4 : " +
                Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr4)));
    }
}
