# What is heap

- A Heap is a complete binary tree data structure that satisfies the heap property: for every node, the value of its children is greater than or equal to its own value. Heaps are usually used to implement priority queues, where the smallest (or largest) element is always at the root of the tree.

# what is binary heap

- A Binary Heap is a special type of complete binary tree, meaning all levels are filled except possibly the last, which is filled from left to right.

- It allows fast access to the minimum or maximum element. There are two types of binary heaps: Min Heap and Max Heap.
- Min Heap: The value of the root node is the smallest, and this property is true for all subtrees.
- Max Heap: The value of the root node is the largest, and this rule also applies to all subtrees.

# what is PriorityQueue

A PriorityQueue in Java is a queue where elements are ordered based on their priority, rather than the order of insertion. By default, it uses natural ordering (min-heap), but a custom comparator can be used to define different priorities.

- Elements are processed based on priority rather than insertion order.
- Supports standard queue operations like add(), poll(), and peek().
- Automatically grows as elements are added.
- Uses a heap data structure internally to ensure efficient insertion and removal of the highest-priority element.

# Operation By Implementing min Heap

```
class minHeap{
    int[] arr;
    int size;
    minHeap(int capacity ){
        arr=new int[capacity]
        size=0;
    }
    public void add(int num){
        if(size==arr.length)throw new Exception("Heap is full")
        arr[size++]=num;
        upHeapify(size-1)
    }
    void upHeapify(int idx){
        int parent=(c-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upHeafiy(parent);
        }
    }
    public void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public int peek(){
        if(size==0){
            System.out.println("Heap is empty")
        }
        return arr[0];
    }

    public int remove(){
        if(size==0)throw new Exception("Heap is Empty");
        int peek=arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        if(i>size)return;
        int lc=2*i+1,rc=2*i-1;
        int minIdx=i;
        if(lc<size && arr[lc]<arr[minIdx])minIdx=lc;
        if(rc<size && arr[rc]<arr[minIdx])minIdx=rc;
        swap(i,minIdx);
        downHeapify(minIdx);
    }
    public void size(){
        return size;
    }
}


```

# Max Heap Implementation

```
class MaxHeap {
    int[] arr;
    int size;

    MaxHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int num) throws Exception {
        if (size == arr.length) throw new Exception("Heap is full");
        arr[size++] = num;
        upHeapify(size - 1);
    }

    void upHeapify(int idx) {
        int parent = (idx - 1) / 2;
        if (idx > 0 && arr[idx] > arr[parent]) {
            swap(idx, parent);
            upHeapify(parent);
        }
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int peek() throws Exception {
        if (size == 0) throw new Exception("Heap is empty");
        return arr[0];
    }

    public int remove() throws Exception {
        if (size == 0) throw new Exception("Heap is Empty");

        int peek = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return peek;
    }

    public void downHeapify(int idx) {
        if (idx >= size) return;

        int lc = 2 * idx + 1;
        int rc = 2 * idx + 2;
        int maxIdx = idx;

        if (lc < size && arr[lc] > arr[maxIdx]) maxIdx = lc;
        if (rc < size && arr[rc] > arr[maxIdx]) maxIdx = rc;

        if (maxIdx != idx) {
            swap(idx, maxIdx);
            downHeapify(maxIdx);
        }
    }

    public int size() {
        return size;
    }

```

# Heap Sort Using max Heap

```
class HeapSort {

    // Build Max Heap
    static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify (MaxHeap)
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Heap Sort
    static void heapSort(int[] arr) {
        int n = arr.length;

        buildMaxHeap(arr, n);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    // Print Array
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 2, 8};

        heapSort(arr);

        printArray(arr);
    }
}

```

# Heap Sort Using Min Heap

```
class HeapSortMin {

    // Build Min Heap
    static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify (MinHeap)
    static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    // Heap Sort using MinHeap
    static void heapSort(int[] arr) {
        int n = arr.length;

        buildMinHeap(arr, n);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 2, 8};

        heapSort(arr);

        printArray(arr);
    }
}

```

# Operation using STL

PriorityQueue = Heap in Java

Default → Min Heap
PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap

With Comparator → Max Heap
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

1.  Insert Operation (Heap Insert)
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(10);
    pq.add(5);
    pq.add(20);
    pq.add(2);

System.out.println(pq);

add() or offer() inserts elements.
Heap property is automatically maintained.
Time Complexity: O(log n)

2. Extract Operation (Remove Root)
   Extract Min (Min Heap)
   int min = pq.poll();
   System.out.println("Extracted: " + min);

poll() removes and returns the root element.

In Min Heap → smallest element is removed.

⏱ Time Complexity: O(log n)

3. Peek Operation (Get Root without removing)
   int top = pq.peek();
   System.out.println("Top element: " + top);

⏱ Time Complexity: O(1)

4.  Delete Operation (Remove Specific Element)
    Code
    pq.remove(10); // delete element 10

Removes a specific element from heap.

Java internally re-heapifies.

⏱ Time Complexity: O(n) (search + heapify)

5. Heapify Operation (Automatic in PriorityQueue)

👉 In Java, you don’t call heapify directly.
Heapify happens automatically after insert/delete.

Example:

pq.add(1); // heapify up
pq.poll(); // heapify down

6.  Max Heap using PriorityQueue
    Code
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

maxHeap.add(10);
maxHeap.add(5);
maxHeap.add(20);

System.out.println(maxHeap.poll()); // 20

7.  Full Example Program (All Heap Operations)
    import java.util.\*;

public class HeapDemo {
public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap

        // Insert
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(2);

        System.out.println("Heap: " + pq);

        // Peek
        System.out.println("Top: " + pq.peek());

        // Extract Min
        System.out.println("Extracted: " + pq.poll());

        // Delete specific element
        pq.remove(10);

        System.out.println("Heap after deletion: " + pq);
    }

}
