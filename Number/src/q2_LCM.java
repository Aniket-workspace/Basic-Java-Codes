// Java Program to find LCM of two numbers

import java.util.Scanner;

public class q2_LCM {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int num1 = 0 , num2 = 0, lcm = 0, max = 0;

        System.out.println("Enter 1st Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        num2 = sc.nextInt();

        // logic
        max = (num1 > num2) ? num1 : num2;
        for(int i = max; i <= num1 * num2; i++){
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM: " + lcm);

    }
}
