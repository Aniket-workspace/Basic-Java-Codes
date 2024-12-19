// Problem Statement: Write a Java program to find the index of a specific element in an array of strings.

import java.util.Scanner;

public class q9_index_of_ele {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length:");
        int n = sc.nextInt();

        System.out.println("Enter array Words:");
        String arr[] = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Enter Word: ");
        String find = sc.next();

        // Logic
        boolean flag = false;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(find)) {
                flag = true;
                break;
            }else{
                flag = false;
            }   
        }
        if (flag == true) {
            System.out.println("Index: " + i);
        }else{
            System.out.println("Word not Found");
        }
        
    }
}
