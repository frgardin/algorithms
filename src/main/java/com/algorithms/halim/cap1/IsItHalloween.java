package com.algorithms.halim.cap1;

import java.util.Scanner;

public class IsItHalloween {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String finalAnswer = s.contains("DEC 25") || s.contains("OCT 31") ? "yup" : "nope";
        System.out.println(finalAnswer);
    }
}
