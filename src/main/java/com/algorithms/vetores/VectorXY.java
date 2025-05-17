package com.algorithms.vetores;

public class VectorXY {


    private double x;
    private double y;

    public enum Method {
        POL,
        REC
    }

    public VectorXY(double x, double y, Method method) {
        if (method == Method.REC) {
            this.x = x;
            this.y = y;
            return;
        }
        if (method == Method.POL) {
            double modulus = x;
            double angleInDegrees = y;
            this.x = modulus * Math.cos(Math.toRadians(angleInDegrees));
            this.y = modulus * Math.sin(Math.toRadians(angleInDegrees));
        }
    }

    public VectorXY sum(VectorXY v1) {
        return new VectorXY(this.x + v1.x, this.y + v1.y, Method.REC);
    }

    public VectorXY minus(VectorXY v1) {
        return new VectorXY(this.x - v1.x, this.y - v1.y, Method.REC);
    }

    @Override
    public String toString() {
        return "VectorXY [x=" + x + ", y=" + y + ", modulus=" + getModulus() + ", degrees=" + getXYAngle() + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getModulus() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double getXYAngle() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public double getYXAngle() {
        return Math.toDegrees(Math.atan2(x, y));
    }
}

