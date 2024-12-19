import java.util.Scanner;

public class q4_check_prime_no {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        if (num == 1) {
            flag = false;
        }

        if (num == 2) {
            flag = true;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0 ) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(num + " is prime number");
        }else{
            System.out.println(num + " is not prime number");
        }
    }
}
