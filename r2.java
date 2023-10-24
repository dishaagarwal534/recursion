import java.util.Scanner;

public class r2 {
    // sum of for n natural numbers
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int i = 1;
        sumNumb(i, n, sum);
    }

    public static void sumNumb(int i, int n, int sum) {
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNumb(i + 1, n, sum);
    }
}
