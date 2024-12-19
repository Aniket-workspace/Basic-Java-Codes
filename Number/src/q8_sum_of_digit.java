import java.util.Scanner;

public class q8_sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int rem = num % 10; 
            sum += rem;
            num = num/10;
        }

        System.out.println("Addition is " + sum);
    }
}
