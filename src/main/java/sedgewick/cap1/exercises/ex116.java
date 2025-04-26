package sedgewick.cap1.exercises;

public class ex116 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.printf(String.valueOf(f));
            f = f + g;
            g = f - g;
        }

        //THE MOTHERFUCKER FIBONACCI SEQUENCE 
    }
}
