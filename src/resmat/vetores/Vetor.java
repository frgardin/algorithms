package resmat.vetores;

public class Vetor {

    int x;
    int y;

    public Vetor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getXAngle() {
        return Math.atan2(y, x) * 180.0 / Math.PI;
    }

    public double getYAngle() {
        return Math.atan2(x, y) * 180.0 / Math.PI;
    }
}
