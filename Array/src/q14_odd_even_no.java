// Counting the number of even and odd elements in an array

import java.util.Scanner;

public class q14_odd_even_no {
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
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                }else{
                    odd++;
                }
            
        }

        System.out.println();
        System.out.println("Even No: " + even);
        System.out.println("odd No: " + odd);


    }
}
