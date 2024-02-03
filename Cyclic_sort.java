import java.util.Arrays;
import java.util.Scanner;

public class Cyclic_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i]=in.nextInt();
        }
        cyclesort(num);
        System.out.println(Arrays.toString(num));
    }

    static void cyclesort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
