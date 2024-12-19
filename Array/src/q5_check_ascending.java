// Problem Statement: Write a Java program to check if an array of integers is sorted in ascending order.

import java.util.Scanner;

public class q5_check_ascending {
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
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }

        System.out.println();
        if (flag == true) {
            System.out.println("array of integers is sorted in ascending order");
        }
        else{
            System.out.println("array of integers is not sorted in ascending order");
        }
    }
}
