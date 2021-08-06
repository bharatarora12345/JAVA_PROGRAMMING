package Recursion;

import java.util.Scanner;

public class ReplaceCharacter {
//    public static String  replaceChar(String s , char a , char b){
//        String ans = "";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == a){
//                ans = ans + b;
//            }
//            else if (s.charAt(i) != a){
//                ans = ans + s.charAt(i);
//            }
//        }
//        return ans;
//    }

    public static String replaceCharRec(String s , char a , char b){
        if (s.length() < 1){
            return s;
        }
        if (s.charAt(0) == a){
            return b + replaceCharRec(s.substring(1) , a , b);
        }
        return s.charAt(0) + replaceCharRec(s.substring(1) , a, b);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = new char[2];
        for (int i = 0; i < 2; i++) {
            ch[i] = sc.next().charAt(0);
        }
        char a = ch[0];
        char b = ch[1];
        System.out.println(replaceCharRec(s , a , b));
    }
}
