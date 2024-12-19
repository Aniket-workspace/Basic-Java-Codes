import java.util.Scanner;

public class q6_reverse_triangle_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        System.out.println("Pattern:");
        for (int i = n; i >= 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(" * " + " ");
            }
            System.err.println(" ");
        }
    }
}
