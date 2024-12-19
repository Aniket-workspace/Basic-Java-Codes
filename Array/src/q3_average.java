// Problem Statement: Write a Java program to calculate the average of elements in an array of doubles.

import java.util.Scanner;

public class q3_average {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length");
        int n = sc.nextInt();

        System.out.println("Enter array Elements");
        double arr[] = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Logic
        double avg = 0.0d;
        double sum = 0.0d;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        avg = sum / n;
        System.out.println();
        System.out.println("Average: " + avg );
    }
}
