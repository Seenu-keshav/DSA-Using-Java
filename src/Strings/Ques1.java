// Reverse a string.

package Strings;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
