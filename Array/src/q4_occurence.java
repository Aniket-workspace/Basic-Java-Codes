// Problem Statement: Implement a Java program to count the number of occurrences of a specific element in an array of integers.

import java.util.Scanner;

public class q4_occurence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length");
        int n = sc.nextInt();

        System.out.println("Enter array Elements");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Number ");
        int find = sc.nextInt();

        System.out.println("Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Logic
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                count++;
            }
        }

        System.out.println();
        System.out.println("Number of occurrences: " + count);
    }
}
