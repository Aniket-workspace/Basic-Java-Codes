import java.util.Scanner;

public class q14_factorial {

    static int factorial(int n){
        if (n == 0) {
            return 1;
        }else{
            return(n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        // First Method

        // int fact = 1;
        // for (int i = 1; i <= num; i++) {
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of given number: ");
        // System.out.println(fact);


        // Second Method
        System.out.println("Factorial of given number: ");
        System.out.println(factorial(num));
    }
}
