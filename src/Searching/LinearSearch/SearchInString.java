package Searching.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String  str = "Abutalib Hussain";
        char target = 't';
        System.out.println(Search(str, target));
        System.out.println(search(str, target));

    }
    static boolean Search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for( int i=0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    //using for each method
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

