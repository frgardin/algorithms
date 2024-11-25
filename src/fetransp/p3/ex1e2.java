package fetransp.p3;

public class ex1e2 {

    public static void main(String[] args) {
        double le = 5E-3;
        double d = 200E-3;
        double ka = 240;
        double kc = 390;
        double tf = 110;
        double q = 600;

        System.out.println(tf - ( 4 * q * le) / (Math.pow(d, 2)) / ka);
        System.out.println(tf - ( 4 * q * le) / (Math.pow(d, 2)) / kc);

    }
}
