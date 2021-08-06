package Recursion;

import java.util.Scanner;

public class ReplcePI {
    public static String replacePI(String s ){
        if (s.length() == 0 || s.length() == 1){
            return s;
        }
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i'){
            String smallOutput = replacePI(s.substring(2));
            return "3.14" + smallOutput;
        }else{
            String smallOutput = replacePI(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.nextLine();
        System.out.println(replacePI(s));
    }
}
