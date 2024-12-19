import java.util.Scanner;

public class q5_count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // System.out.println("Enter Number: ");
        // int num = sc.nextInt();
        int num = 1567;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("count " + count);
    }
}
