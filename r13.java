public class r13 {
    // All keypad combinations
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String args[]) {
        String arr = "23";
        print(arr, 0, "");
    }

    public static void print(String arr, int i, String cString) {
        if (i == arr.length()) {
            System.out.println(cString);
            return;
        }
        char curr = arr.charAt(i);
        String mapping = keypad[curr - '0'];
        for (int j = 0; j < mapping.length(); j++) {
            print(arr, i + 1, cString + mapping.charAt(j));
        }
    }
}

/*
 * 0-
 * 1- abc
 * 2- def
 * 3- ghi
 * 4- jkl
 * 5- mno
 * 6- pqrs
 * 7- tu
 * 8- vwx
 * 9- yz
 */