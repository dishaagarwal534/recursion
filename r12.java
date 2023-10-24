import java.util.HashSet;

public class r12 {
    // unique subsequences
    // Hashset- storing all the unique elements
    public static void main(String args[]) {
        String arr = "aaa";
        int i = 0;
        HashSet<String> set = new HashSet<>();
        subsequence(arr, i, "", set);
    }

    public static void subsequence(String arr, int i, String newString, HashSet<String> set) {
        if (i == arr.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr = arr.charAt(i);
        // to come
        subsequence(arr, i + 1, newString + curr, set);
        // to not come
        subsequence(arr, i + 1, newString, set);
    }
}
