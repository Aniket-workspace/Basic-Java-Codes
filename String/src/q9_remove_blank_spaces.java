import java.util.Scanner;

public class q9_remove_blank_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' ) {
                str2 += str.charAt(i);
            }
        }

        System.err.println("After Removing other stuff: ");
        System.out.println(str2);
    }
}
