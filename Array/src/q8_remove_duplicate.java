// Java Program for Removing Duplicates elements from an array

import java.util.Scanner;

public class q8_remove_duplicate {

    static int duplicate(int a[], int n){
    

        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;
        for(int i = 0; i < n - 1; i++)
        {
            if (a[i] != a[i+1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n-1];

        return j;
    }
    public static void main(String[] args) {
        int temp = 0;
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
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print(arr[i] + " ");

        }

        int new_n = duplicate(arr, n);

        System.out.println();
        System.out.println("New Array..");
        for (int i = 0; i < new_n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
