package Arrays;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[])
    {
        String st1 = "Geeks";
        String st2 = "eeGesk";

        int res = 0, i;
        for(i = 0; i < st1.length(); i++)
            res ^= st1.charAt(i);

        for(i = 0; i < st2.length(); i++)
            res ^= st2.charAt(i);

        System.out.print((char)res);

    }
}