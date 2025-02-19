package resmat.vetores;

public class VectorXY {


    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public VectorXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getXYAngle() {
        return Math.atan2(y, x) * 180.0 / Math.PI;
    }

    public double getYXAngle() {
        return Math.atan2(x, y) * 180.0 / Math.PI;
    }
}

