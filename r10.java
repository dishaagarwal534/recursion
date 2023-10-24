import java.util.Scanner;

//move an element at the end of string
public class r10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char element = sc.next().charAt(0);
        sc.close();
        int i = 0;
        String newString = "";
        int count = 0;
        move(str, element, i, count, newString);
    }

    public static void move(String str, char element, int i, int count, String newString) {
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                newString += element;
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(i);
        if (curr == element) {
            count++;
            move(str, element, i + 1, count, newString);
        } else {
            newString += curr;
            move(str, element, i + 1, count, newString);
        }

    }
}
