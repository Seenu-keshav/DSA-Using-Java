// Max profit with unlimited transactions.

package Arrays;
import java.util.Scanner;
public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter " + n + " elements for the stock prices array:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int maxProfit = maximizeProfit(prices);
        System.out.println("The maximum profit with unlimited transactions is: " + maxProfit);

        sc.close();
    }

    public static int maximizeProfit(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }
}
