// Java program to toggle each character in a string

import java.util.Scanner;

public class q4_toggel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word:");
        String str = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str2 += Character.toLowerCase(str.charAt(i));
            } else {
                str2 += Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println("New Word:");
        System.out.println(str2);
    }

}
