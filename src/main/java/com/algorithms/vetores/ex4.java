package com.algorithms.vetores;

public class ex4 {

    public static void main(String[] args) {
        VectorXY v1 = new VectorXY(27, 30, VectorXY.Method.POL);
        VectorXY v2 = new VectorXY(21, Math.toDegrees(Math.atan2(4, -3)), VectorXY.Method.POL);

        System.out.println(v2.minus(v1));
    }
}
