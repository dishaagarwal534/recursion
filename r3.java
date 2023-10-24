import java.util.Scanner;

// factorial of a number n
public class r3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int f = 1;
        fact(n, f);
    }

    public static void fact(int n, int f) {
        if (n == 0) {
            System.out.println(f);
            return;
        }
        f *= n;
        fact(n - 1, f);
    }
}

// n=5 print= 5*4*3*2*1