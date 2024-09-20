package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i< 26; i++){
            char ch = (char)('a' + i);
        //    System.out.println(ch);
            series +=ch;
        }
        System.out.println(series);
        // Why it is not very good solution , whats the problem here.
        // As string are imutable -- every time we concatenate ch into series the new string object is created everytime
        //Lot of memory is wasted because every time the series is pointed to new object and the previous object is just get ignored
        //that take a lot of space.
    }
}
