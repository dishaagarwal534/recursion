import java.util.Scanner;

public class r6 {
    // Tower oh hanoi
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        towerOfHanoi(n, "S", "H", "D");
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("transfer from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }
}

// only one disk tranfers at one time
// smaller on larger disk always