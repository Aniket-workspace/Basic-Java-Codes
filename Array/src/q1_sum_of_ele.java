// Problem Statement: Write a Java program to find the sum of all elements in an array of integers.
import java.util.Scanner;
public class q1_sum_of_ele {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length");
        int n = sc.nextInt();

        System.out.println("Enter array Elements");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // Logic
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        System.out.println();
        System.out.println("Addition: " + sum );
    }
}
