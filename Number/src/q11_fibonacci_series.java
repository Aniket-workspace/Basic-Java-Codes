// fibonacci series upto nth number

import java.util.Scanner;

public class q11_fibonacci_series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n th number: ");
        int n = 10;

        int num1 = 0, num2 = 1, num3 = 0;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i < n - 2; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.print(num3 + " ");
        }
    }
}
