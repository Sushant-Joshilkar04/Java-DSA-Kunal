import java.util.Arrays;

public class search_in_strings {
    public static void main(String[] args) {
        String name = "sushant";
        char target = 'a';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==target){
//                return true;
//            }
//        }

        for(char ch:str.toCharArray())
            if(ch == target){
                return true;
            }

        return false;
    }

}
