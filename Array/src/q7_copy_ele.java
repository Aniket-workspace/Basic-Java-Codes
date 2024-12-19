// Problem Statement: Write a Java program to copy all elements from one array to another array.

import java.util.Scanner;

public class q7_copy_ele {
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
        int arr2[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println();
        System.out.println("2nd Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
