public class Linear_search {

    public static void main(String[] args) {
        int[] nums = {23, 45, 85, 5, 46, 42, 13, 23};
        int target = 46;
        int ans = linearsearch(nums, target);
        int ans2 = linearsearch2(nums, target);
        boolean ans3 = linearsearch3(nums,target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static boolean linearsearch3(int[] arr,int target){


        if(arr.length == 0){
            return false;
        }

        for (int element : arr) {
            // check for element at every ind
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of return statements above have executed
        // hence target ot found
        return false;
    }

    static int linearsearch2(int[] arr,int target){


        if(arr.length == 0){
            return -1;
        }

        for (int element : arr) {
            // check for element at every ind
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of return statements above have executed
        // hence target ot found
        return Integer.MAX_VALUE;
    }

    static int linearsearch(int[] arr,int target){
        int i;

        if(arr.length==0){
            return -1;
        }

        for( i=0;i< arr.length;i++){
            // check for element at every index
            int element=arr[i];
            if(element == target) {
                return i;
            }
        }
        // this line will execute if none of return statements above have executed
        // hence target ot found
        return -1;
}

}