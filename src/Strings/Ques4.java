// Implement strstr / indexOf (find substring in string)

package Strings;
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to find: ");
        String subString = sc.nextLine();

        int index = indexOf(mainString, subString);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
        sc.close();
    }

    public static int indexOf(String mainString, String subString) {
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            int j;
            for (j = 0; j < subString.length(); j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subString.length()) {
                return i;
            }
        }
        return -1;
    }
}
