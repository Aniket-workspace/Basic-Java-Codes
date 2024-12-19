import java.util.Scanner;

public class q15_perfect_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num = sc.nextInt();

        boolean flag = false;

        for (int i = 1; i < num; i++) {
            if (i * i == num) {
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }

        if (flag) {
            System.out.println(num + " is perfect square");
        }
        else{
            System.out.println(num + " is not perfect square");

        }
    }
}
