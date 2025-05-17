package com.algorithms.vetores;

public class VectorXYZ {

    private double x;
    private double y;
    private double z;

    public VectorXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getModulus() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double getXAngle() {
        return getAngle(x);
    }

    public double getYAngle() {
        return getAngle(y);
    }

    public double getZAngle() {
        return getAngle(z);
    }

    private double getAngle(double angle) {
        return Math.toDegrees(Math.acos(angle / getModulus()));
    }
}
