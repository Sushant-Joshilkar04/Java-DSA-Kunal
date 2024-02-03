public class Search_in_range {
    public static void main(String[] args) {
    int[] nums ={2, 26,-7,45,46,47,8,3,66};
    int target = 45;
    System.out.println(linearsearch(nums,target,1,4));
    }

    static int linearsearch(int[] arr, int target,int start,int end){
        int i;

        if(arr.length==0){
            return -1;
        }

        for( i=start; i<= end;i++){
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
