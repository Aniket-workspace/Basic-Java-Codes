import java.util.Scanner;

public class q3_prime_no_range {

    static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lower Limit: ");
        int lower = sc.nextInt();

        System.out.println("Enter Upper Limit: ");
        int upper = sc.nextInt();
        System.out.println("Prime Numbers: ");

        for(int i = lower; i <= upper; i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        

    }
}
