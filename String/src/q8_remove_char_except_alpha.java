// Remove all characters from string except alphabets

import java.util.Scanner;

public class q8_remove_char_except_alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                str2 += str.charAt(i);
            }
        }

        System.err.println("After Removing other stuff: ");
        System.out.println(str2);
    }
}
