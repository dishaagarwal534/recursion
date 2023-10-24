public class r1 {
    // numbers from 5 to 1
    public static void main(String args[]) {
        int n = 5;
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // printing outer loop
        System.out.println(n);
        printNumbers(n - 1); // recursion performing task
    }

}

/*
 * numbers from 1 to 5:
 * main(){
 * int n=1;
 * printNumbers(n);
 * }
 * public static void printNumbers(int n) {
 * // base case
 * if (n == 6) {
 * return;
 * }
 * // printing outer loop
 * System.out.println(n);
 * printNumbers(n + 1); // recursion performing task
 * }
 */
