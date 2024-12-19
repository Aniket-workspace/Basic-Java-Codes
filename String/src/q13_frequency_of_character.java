import java.util.Scanner;

public class q13_frequency_of_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        // String str = sc.nextLine();
        String str = "aniketgawai";

        char arr[] = str.toCharArray();
        int freq[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }

        }
        System.out.println("Character and their frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (arr[i] == ' ' || arr[i] != '0') {
                System.out.println(arr[i] + "-" + freq[i]);
            }
        }
    }
}
