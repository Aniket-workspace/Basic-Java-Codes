// Occurrence of a digit in a given number using Java

import java.util.Scanner;

public class q6_occurance_of_digit_in_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Enter Digit: ");
        int f = sc.nextInt();

        int count = 0;
        while (num > 0) {
            int rem = num%10;
            if (rem == f) {
                count++;
            }
            num = num/10;
        }

        System.out.println("count: " + count);
    }
}
