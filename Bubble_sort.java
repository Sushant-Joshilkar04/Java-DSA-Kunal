import java.util.Arrays;
import java.util.Scanner;
public class Bubble_sort {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int[] num = new int[5];
     for(int i=0;i<5;i++){
         num[i]=in.nextInt();
     }
      bubblesort(num);
        System.out.println(Arrays.toString(num));
    }

    static void bubblesort(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i=0;i<arr.length-1 ;i++){
            swapped=false;
            // for each step,max item will come at last respective index
            for(int j=1;j<arr.length-i;j++){
                // swap if item is smaller than previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if you did not swap particular value of i , it means array is sorted hence stop
            if(swapped==false)  //!swapped=swapped==false
                break;
        }
    }
}
