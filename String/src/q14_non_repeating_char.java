import java.util.Scanner;

public class q14_non_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        char arr[] = str.toCharArray(); 

        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = i+1; j < str.length(); j++) {
        //         if (arr[i] == arr[j]) {
        //             arr[j] = ' ';
        //             arr[i] = ' ';
        //         }
        //     }
            
        // }

        // System.out.println("Non repeating characters:");
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != ' ') {
        //         System.out.print(arr[i]);
        //     }
        // }







        int freq[] = new int [str.length()];


        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = ' ';
                }
            }
            
        }
        System.out.println("Non repeating characters:");
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == 1 && arr[i] != ' '){
                System.out.print(arr[i]);
            }
        
    }
}
}
