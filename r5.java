import java.util.Scanner;

public class r5 {
    // Print x^n(stack height = n)
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n) {
        // Base case 1
        if (n == 0) {
            return 1;
        }
        // Base case 2
        if (x == 0) {
            return 0;
        }
        int xLeft = power(x, n - 1);
        int pow = x * xLeft;
        return pow;
    }
}

// n=5
// print= x*x*x..5times