import java.util.Scanner;

public class r4 {
    // fibonacci series
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        fibonacci(n1, n2, n - 2);
    }

    public static void fibonacci(int n1, int n2, int n) {
        if (n == 0) {
            return;
        }
        int n3 = n1 + n2;
        System.out.print(n3 + " ");
        fibonacci(n2, n3, n - 1);
    }
}

// 0 1 1 2 3 5 8
