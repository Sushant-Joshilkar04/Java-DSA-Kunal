import java.util.Arrays;
import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i]=in.nextInt();
        }
        selectsort(num);
        System.out.println(Arrays.toString(num));
    }

    static void selectsort(int[] arr){
     for(int i=0;i<arr.length;i++){
         // find max item in remaining array and swap with correct index
         int last=arr.length-i-1;
         int maxIdx = getMaxIndex(arr,0,last);
         swap(arr,maxIdx,last);
     }
    }

    private static int getMaxIndex(int[] arr, int start,int end){
         int max = start;
         for(int i=0;i<=end;i++){
             if(arr[max]<arr[i])
                 max=i;
         }

         return max;
        }

        static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        }
}

