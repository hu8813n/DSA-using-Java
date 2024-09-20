package Strings;

public class StringBuilderSB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< 26; i++){
            char ch = (char)('a' + i);
            //    System.out.println(ch);
            builder.append(ch);
            // here , everytime we adding ch , the new object is not created because StringBuilder is mutable
        }
        System.out.println(builder.toString());
    }
}
