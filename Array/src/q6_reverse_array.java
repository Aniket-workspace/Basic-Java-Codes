// Problem Statement: Implement a Java program to reverse an array of characters.

import java.util.Scanner;

public class q6_reverse_array {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length");
        int n = sc.nextInt();

        System.out.println("Enter array Elements");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Logic
        System.out.println();
        System.out.println("Reversed Array: ");
        for (int j = n-1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

        
        
    }
}
