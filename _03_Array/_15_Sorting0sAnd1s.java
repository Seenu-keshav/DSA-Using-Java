public class _15_Sorting0sAnd1s {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 0, 0, 1, 1 };
    // int noZeores = 0;
    // int noOnes = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // noZeores++;
    // } else {
    // noOnes++;
    // }
    // }

    // for (int i = 0; i < noZeores; i++) {
    // arr[i] = 0;
    // }
    // for (int i = noZeores; i < arr.length; i++) {
    // arr[i] = 1;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // System.out.println("No of Zeroes " + noZeores + "No Of Ones" + noOnes);

    // one pass solution
    // two pointer approach
    // swapping
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      if (arr[i] == 0)
        i++;
      if (arr[j] == 1)
        j--;
      if (arr[i] == 1 && arr[j] == 0) {
        arr[i] = 0;
        arr[j] = 1;
        i++;
        j--;
      }
    }
    for (int ele : arr) {
      System.out.println(ele);
    }
  }
}
