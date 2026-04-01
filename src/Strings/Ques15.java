// Check if string s is rotation of string t.

package Strings;
import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean isRotation = isRotation(s, t);

        if (isRotation) {
            System.out.println("\"" + s + "\" is a rotation of \"" + t + "\"");
        } else {
            System.out.println("\"" + s + "\" is not a rotation of \"" + t + "\"");
        }

        sc.close();
    }

    public static boolean isRotation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String concatenated = t + t;
        return concatenated.contains(s);
    }
}
