public class r11 {
    // Print subsequence of string
    public static void main(String args[]) {
        String arr = "abc";
        int i = 0;
        subsequence(arr, i, "");
    }

    public static void subsequence(String arr, int i, String newString) {
        if (i == arr.length()) {
            System.out.println(newString);
            return;
        }
        char curr = arr.charAt(i);
        // to come
        subsequence(arr, i + 1, newString + curr);
        // to not come
        subsequence(arr, i + 1, newString);
    }
}
