public class _16_DutchFlagAlgo {
  public static void main(String[] args) {
    // // m-1 two pass solution
    int[] arr = { 0, 1, 1, 2, 0, 2, 0, 0, 2, 1 };
    int n = arr.length;
    // int noOfZeroes = 0;
    // int noOfOnes = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == 0)
    // noOfZeroes++;
    // if (arr[i] == 0)
    // noOfOnes++;
    // }
    // for (int i = 0; i < n; i++) {
    // if (i < noOfZeroes)
    // arr[i] = 0;
    // else if (i < noOfOnes + noOfZeroes)
    // arr[i] = 1;
    // else
    // arr[i] = 2;
    // }
    // for (int i = 0; i < n; i++) {
    // System.out.println(arr[i]);
    // }

    // m-2 dutch flag algorithm
    // 3 pointer approach low mid high
    // step 1 break array in four parts
    //

    int mid = 0, hi = n - 1, lo = 0;
    while (mid <= hi) {
      if (arr[mid] == 0) {
        int temp = arr[mid];
        arr[mid] = arr[lo];
        arr[lo] = temp;
        lo++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {// arr[mid]==2
        int temp = arr[mid];
        arr[mid] = arr[hi];
        arr[hi] = temp;
        hi--;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
