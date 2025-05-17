package com.algorithms.arrays.holczer.balazs.theory;


import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<Integer> ar = new java.util.ArrayList<>();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);

        System.out.println(ar);
        ar.set(0, 10);
        System.out.println(ar);
        ar.clear();
        System.out.println(ar);
    }
}
