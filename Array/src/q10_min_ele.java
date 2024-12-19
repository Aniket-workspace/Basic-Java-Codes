// Problem Statement: Implement a Java program to find the smallest element in an array of doubles.

import java.util.Scanner;

public class q10_min_ele {
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
        int min = 1000;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            
        }

        System.out.println();
        System.out.print("Maximum Value: " + min);

    }
}
