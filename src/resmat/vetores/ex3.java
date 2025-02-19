package resmat.vetores;

public class ex3 {

    public static void main(String[] args) {
        VectorXY v1 = new VectorXY(27, 30, VectorXY.Method.POL);
        VectorXY v2 = new VectorXY(21, Math.toDegrees(Math.atan2(4, -3)), VectorXY.Method.POL);

        System.out.println(v1.sum(v2));
    }
}
