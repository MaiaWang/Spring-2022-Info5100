package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        System.out.println(compress("Aabbbbbbbbbbbbbbbccc"));
//        System.out.println(compress("Abccdder"));
        System.out.println(5/2);
        System.out.println(5/2.0);

    }
    public static String compress(String s) {
        String s1 = s.toLowerCase();
        char current = s1.charAt(0);
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(current);

        for(char c : s1.toCharArray()){
            if(c == current){
                count ++;
            }else{
                sb.append(count);
                current = c;
                count = 1;
                sb.append(current);
            }
        }
        sb.append(count);
        if(sb.toString().length() >= s.length()){
            return s;
        }
        return sb.toString();
    }

}
