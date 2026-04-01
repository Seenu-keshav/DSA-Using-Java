// Generate all permutations of a string (unique permutations if duplicates present)

package Strings;
import java.util.*; 
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        HashSet<String> permutations = new HashSet<>();
        generatePermutations("", input, permutations);

        System.out.println("Unique permutations are:");
        for (String str : permutations) {
            System.out.println(str);
        }

        sc.close();
    }

    public static void generatePermutations(String prefix, String remaining, HashSet<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result
                );
            }
        }
    }
}
