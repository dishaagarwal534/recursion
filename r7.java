import java.util.Scanner;

public class r7 {
    // reverse strig using recursion
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int i = str.length() - 1;
        reverse(str, i);
    }

    public static void reverse(String str, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(str.charAt(i));
        reverse(str, i - 1);
    }
}
