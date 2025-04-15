package helio.pedrini.recursividade;

public class Potencia {

    public static double potencia(double x, double y) {
        return Math.pow(x, y);
    }

    public static double potenciaRecursiva(double x, double y) {
        if (y == 0) return 1;
        return x * potenciaRecursiva(x, --y);
    }

    public static void main(String[] args) {
        System.out.println(potencia(312, 12));
        System.out.println(potenciaRecursiva(312, 12));
    }
}
