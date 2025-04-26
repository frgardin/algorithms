package halim.cap1;

import java.io.File;
import java.util.Scanner;

public class OddGnome {


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src/halim/cap1/file/oddgnome.txt"));
        int a = sc.nextInt();
        while(a-- > 0) {
            int b = sc.nextInt();
            int counter = 1;
            int r = 1;
            int anterior = -1;
            while(b-- >0) {
                int c = sc.nextInt();
                if(anterior == -1) {
                    anterior = c;
                    counter++;
                    continue;
                }
                if(c - anterior != 1 && counter == 2) {
                    int d = sc.nextInt();
                    if (d - c != 1) {
                        r = 2;
                    }
                    sc.nextLine();
                    System.out.printf("%d%n", r);
                    b=0;
                    continue;
                }
                if(c - anterior != 1) {
                    sc.nextLine();
                    r = counter;
                    System.out.printf("%d%n", r);
                    b=0;
                    continue;
                }
                anterior = c;
                counter++;
            }
        }
    }
}
