// Check a Character is a Vowel or Consonant

import java.util.Scanner;

public class q1_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character:");
        char alpha = sc.next().charAt(0);

        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println(alpha + " is vowel");
        } else {
            System.out.println(alpha + " is consonent");

        }
    }
}
