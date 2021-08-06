package string2Darray;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdefgh";
        str = str + "def";
//        char chars[] = new char[n];
//        System.out.println(str.charAt(1));
//        System.out.println(str.length());
//        System.out.println(str.substring(1,6));
//        String temp =str.substring(str.length());
//        System.out.println(temp.length());
//        System.out.println(str.contains("cd"));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
