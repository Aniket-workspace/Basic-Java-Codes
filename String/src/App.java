import java.util.*;
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String str = scanner.nextLine();
        char string[] = str.toCharArray();
        
        for(int i=0; i<str.length();i++){
             
            for(int j=i+1; j<str.length();j++){
                if(string[i] == string[j]){
                    string[j] =' ';
                    string[i] = ' ';
                }
            }
        }
        // System.out.println(string);
        System.out.println("Non-repeating Character in string is :- ");
        for(int i=0;i<str.length();i++){
            if(string[i]!=' '){
                System.out.print(string[i]);
            }
        }
       
}
}