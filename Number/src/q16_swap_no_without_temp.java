import java.util.Scanner;

public class q16_swap_no_without_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1 :");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2 :");
        int num2 = sc.nextInt();

        System.out.println("num 1 : " + num1);  // 5
        System.out.println("num 2 : " + num2);  // 2

        num1 = num1 + num2;  // 5 + 2 = 7
        num2 = num1 - num2;  // 7 - 2 = 5
        num1 = num1 - num2;  // 7 - 5 = 2

        System.out.println();
        System.out.println("After Swap");
        System.out.println("num 1 : " + num1);
        System.out.println("num 2 : " + num2);

    }
}
