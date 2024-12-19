import java.util.Scanner;

public class q10_remove_bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) != '(' && str.charAt(i) != ')' ) && (str.charAt(i) != '[' && str.charAt(i) != ']' ) && (str.charAt(i) != '{' && str.charAt(i) != '}' )) {
                str2 += str.charAt(i);
            }
        }

        System.err.println("After Removing Brackets: ");
        System.out.println(str2);
    }
}
