public class q3_length_without_strlen {
    public static void main(String[] args) {
        String str = "Aniket";

        int count = 0;

        for (int i = 0; i < str.toCharArray().length; i++) {
            count++;
        }

        System.out.println("String length: " + count);
    }
}
