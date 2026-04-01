// Max profit with at most two transactions.

package Arrays;
import java.util.Scanner;
public class Ques25 {
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
        System.out.println("The maximum profit with at most two transactions is: " + maxProfit);

        sc.close();
    }

    public static int maximizeProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] leftProfits = new int[n];
        int[] rightProfits = new int[n + 1];

        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfits[i] = Math.max(leftProfits[i - 1], prices[i] - minPrice);
        }

        int maxPrice = prices[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfits[i] = Math.max(rightProfits[i + 1], maxPrice - prices[i]);
        }

        int maxTotalProfit = 0;
        for (int i = 0; i < n; i++) {
            maxTotalProfit = Math.max(maxTotalProfit, leftProfits[i] + rightProfits[i + 1]);
        }

        return maxTotalProfit;
    }
}
