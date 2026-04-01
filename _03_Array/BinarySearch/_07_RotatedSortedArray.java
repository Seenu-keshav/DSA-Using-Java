
class Solution {
    public int bs(int[] arr,int lo,int hi ,int target){
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target)hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
         }
         return -1;
    }
    public int search(int[] arr, int target) {
    //   // find pivot
    //   int n=arr.length;
    //   if(n<=2){
     
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==target)return i;
    //     }
    //     return -1;
    //   }
    //   int lo=1,hi=n-2;
    //   int p=-1;
    //   while(lo<=hi){
    //     int mid=lo+(hi-lo)/2;
    //     if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
    //         p=mid; break;
    //     }
    //    else if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
    //         p=mid-1; break;
    //     }else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
    //         if(arr[mid]>arr[n-1]) lo=mid+1;
    //         else hi=mid-1;
    //     }
    //   }  
    //   if(p==-1){// array was never rotated
    //     return bs(arr,0,n-1,target);
    //   }
    //   int left =bs(arr,0,p,target);
    //   if(left!=-1)return left;
    //   int rigth=bs(arr,p+1,n-1,target);
    //   return rigth;

    int n=arr.length;
    int lo=0;
    int hi=n-1;
    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]<=arr[hi]){
            if(target>arr[mid]&&target<=arr[hi])lo=mid+1;
            else hi=mid-1;
        }else {
            if(target>=arr[lo]&&target<arr[mid])hi=mid-1;
            else lo=mid+1;
        }
    }
    return -1;
    }
}
public class _07_RotatedSortedArray {
  public static void main(String[] args) {

  }
}
