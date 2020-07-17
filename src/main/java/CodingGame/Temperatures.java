package CodingGame;

import java.util.Scanner;

public class Temperatures {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int min = 0;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(i == 0) {
                min = t;
            } else {
                if(Math.abs(t) < Math.abs(min)) {
                    min = t;
                } else if(Math.abs(t) == Math.abs(min)) {
                    min = Math.max(t, min);
                }
            }
        }
        System.out.println(min);
    }
}
