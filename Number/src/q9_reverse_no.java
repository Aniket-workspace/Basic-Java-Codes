import java.util.Scanner;

public class q9_reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        // int num = sc.nextInt();
        int num = 100;

        System.out.println("Reversed Number");
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }

    }
}
