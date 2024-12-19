// Sort first half in ascending order and second half in descending

import java.util.Scanner;

public class q12_half_sort {
    
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array Elements");
        

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
            for (int j = i + 1; j < n/2; j++) {
                if (arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            for (int j = n/2; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }


}
