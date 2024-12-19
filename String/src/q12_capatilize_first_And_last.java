// Capitalize the first and last character of each word of a string

import java.util.Scanner;

public class q12_capatilize_first_And_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sc.nextLine();

        char arr[] = str.toCharArray();
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[0] = Character.toUpperCase(arr[0]);
            arr[len-1] = Character.toUpperCase(arr[len-1]);
            if (arr[i] == ' ') {
                arr[i-1] = Character.toUpperCase(arr[i-1]);
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }
        }

        System.out.println(arr);
    }
}
