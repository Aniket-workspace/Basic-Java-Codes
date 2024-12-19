// Java Program to Check Leap Year or not
import java.util.Scanner;

public class q7_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 !=0) {
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}
