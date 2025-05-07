package codeforces;

import java.util.Scanner;
import java.util.Optional;

public class NearlyLuckyNumber {

    public static void main(String[] args) {
        System.out.println(Optional.of(new Scanner(System.in))
                .map(Scanner::next)
                .filter(s -> s.matches("^(?=[47]*4)(?=[47]*7)[47]+$"))
                .map(s -> "YES")
                .orElse("NO"));
    }
}
