import java.util.Scanner;

public class q2_is_char_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character:");
        char alpha = sc.next().charAt(0);

        if ((alpha >= 'A' && alpha <= 'Z') || (alpha >= 'a' && alpha <= 'z')) {
            System.out.println(alpha + " is Alphabet");
        }else{
            System.out.println(alpha + " is not Alphabet");
        }
    }
}
