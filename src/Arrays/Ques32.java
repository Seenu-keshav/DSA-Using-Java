// Find median of a stream (use heaps)

package Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;
public class Ques32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the stream: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements for the stream:");
        MedianFinder medianFinder = new MedianFinder();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            medianFinder.addNum(num);
            System.out.println("Current median after adding " + num + ": " + medianFinder.findMedian());
        }

        sc.close();
    }
}

class MedianFinder {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max heap for the lower half
        minHeap = new PriorityQueue<>(); // Min heap for the upper half
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}
