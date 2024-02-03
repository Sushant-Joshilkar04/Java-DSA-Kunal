public class Min_number {
        public static void main(String[] args) {
            int[] nums ={2, 26,-7,45,46,47,8,3,66};
            System.out.println(min(nums));
        }

        static int min(int[] arr){
           int min=Integer.MAX_VALUE;
            for(int element:arr){
                if(element<min)
                    min=element;
            }


           return min;
    }

}
