public class q15_count_0_1 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,0,1,0,1,0,1,0,1,0,0,1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Occurence of 1: " + (sum));
        System.out.println("Occurence of 0: " + (arr.length - sum));

    }
}
