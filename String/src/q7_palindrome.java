import java.util.Scanner;

public class q7_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.next();
        String str2 = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        if (str.equals(str2)) {
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");

        }
    }
}
