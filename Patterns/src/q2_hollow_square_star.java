//    *****
//    *   *
//    *   *
//    *   *
//    *****

import java.util.Scanner;

public class q2_hollow_square_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        System.out.println("Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}