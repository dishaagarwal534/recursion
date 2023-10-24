import java.util.Scanner;

public class r9 {
    // check if array is stricly increasing
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int i = 0;
        System.out.println(check(arr, i));
    }

    public static boolean check(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return check(arr, i + 1);
        } else {
            return false;
        }
    }
}
