import java.util.Scanner;

public class q11_sum_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number string");
        String str = sc.next();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
               str2 += str.charAt(i); 
            }
        }

        System.out.println(str2);

        int num = Integer.parseInt(str2);
        int sum = 0;

        while (num > 0) {
            int rem = num % 10; 
            sum += rem;
            num = num/10;
        }

        System.out.println("Addition is " + sum);

    }
}
