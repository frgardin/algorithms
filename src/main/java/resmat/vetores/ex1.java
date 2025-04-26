package resmat.vetores;

public class ex1 {


    public static void main(String[] args) {
        VectorXY vetorXY = new VectorXY(-50, 10, VectorXY.Method.REC);

        System.out.println(vetorXY.getXYAngle());
        System.out.println(vetorXY.getYXAngle());
    }
}
