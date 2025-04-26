package helio.pedrini.recursividade;

public class SomaDigitos {


    public static int somaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return somaDigitos(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(somaDigitos(15));
    }
}
