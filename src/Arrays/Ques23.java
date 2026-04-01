// Given array of stock prices, maximize profit with one transaction.

package Arrays;
import java.util.Scanner;
public class Ques23 {
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
        System.out.println("The maximum profit with one transaction is: " + maxProfit);

        sc.close();
    }

    public static int maximizeProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
