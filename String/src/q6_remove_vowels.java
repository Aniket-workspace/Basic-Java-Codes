import java.util.Scanner;

public class q6_remove_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.next();

        String str2 = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println(str2);
    }
}
