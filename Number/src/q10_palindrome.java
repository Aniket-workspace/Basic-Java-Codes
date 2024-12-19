import java.util.Scanner;

public class q10_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int temp = 0, reverse = 0;
        temp =num;

        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp /10;
        }


        if (num == reverse) {
            System.out.println(num + " is palindrome");
        }else{
            System.out.println(num + " is not palindrome");

        }
    }
}
