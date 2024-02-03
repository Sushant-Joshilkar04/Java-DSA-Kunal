import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort {
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
        for(int i=0;i<arr.length-1;i++){
            for(int j=(i+1);j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }


}
