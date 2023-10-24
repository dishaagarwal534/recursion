import java.util.Scanner;

//find 1st and last occurence of an element in string
public class r8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char element = sc.next().charAt(0);
        sc.close();
        int i = 0;
        occurence(str, i, element);
    }

    public static int first = -1;
    public static int last = -1;

    public static void occurence(String str, int i, char element) {
        if (i == str.length()) {
            System.out.println("first occurence " + first);
            System.out.println("last occurence " + last);
            return;
        }

        if (str.charAt(i) == element) {
            if (first == -1) {
                first++;
            } else {
                last = i;
            }
        }
        occurence(str, i + 1, element);
    }
}
