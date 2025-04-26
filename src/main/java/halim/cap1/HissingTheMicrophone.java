package halim.cap1;

import java.util.Scanner;

public class HissingTheMicrophone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b = false;
        boolean h = false;
        for(char c : s.toCharArray()) {
            if(c == 's') {
                if (b) {
                    h = true;
                    break;
                }
                b = true;
                continue;
            }
            b = false;
        }
        System.out.print(h ? "hiss" : "no hiss");
    }
}
