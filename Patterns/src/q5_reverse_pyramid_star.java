import java.util.Scanner;

public class q5_reverse_pyramid_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        System.out.println("Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.err.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println(" ");
        }
    }
}