import java.util.Scanner;
// Sorted array only
public class Binary_search {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of array");
        n=in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of Array: ");
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Enter target element: ");
        int target=in.nextInt();
          int ans=search(nums,target);
        System.out.println(ans);

    }

    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid;

        while(start<=end){
            mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
           else if(arr[mid]>target){
               end=mid-1;
            }
           else if(arr[mid]<target){
               start=mid+1;
            }
        }
        return 0;
    }


}



// Kunal's Code
//public class BinarySearch {
//
//    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int target = 22;
//        int ans = binarySearch(arr, target);
//        System.out.println(ans);
//    }
//
//    // return the index
//    // return -1 if it does not exist
//    static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return -1;
//    }
//}