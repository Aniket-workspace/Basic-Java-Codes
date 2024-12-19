// Java Program to find GCD or HCF of two numbers

import java.util.Scanner;

public class q1_GCD_or_HCF {
    public static void main(String[] args) {
        int hcf = 0;
        Scanner sc = new Scanner(System.in);

        int num1 = 0 , num2 = 0;

        System.out.println("Enter 1st Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        num2 = sc.nextInt();

        for(int i = 1; i <= num1 || i >= num2; i++){
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF: " + hcf);

    }
}
