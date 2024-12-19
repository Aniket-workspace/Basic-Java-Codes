//    *  *  *  *  *
//    *  *  *  *  *
//    *  *  *  *  *
//    *  *  *  *  *
//    *  *  *  *  *

import java.util.Scanner;

public class q1_square_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        System.out.println("Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.print(" * ");
            }
            System.err.println(" ");
        }
    }
}
