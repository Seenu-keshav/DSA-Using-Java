// Binary Search to find X in sorted array
//https://leetcode.com/problems/search-insert-position/
class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            // int mid=lo+(hi-lo)/2;
            int mid=(lo+hi)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return -1;
    }
}
public class _01_BinarySearch {
  
}
