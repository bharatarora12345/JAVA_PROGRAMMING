package Recursion;

import java.util.Scanner;

public class RemoveDuplicate {

//    public static String removeDuplicate(String s){
//        if (s.length() == 1 || s.length() == 0){
//            return s;
//        }
//        if (s.charAt(0) == s.charAt(1)){
//            return removeDuplicate(s.substring(1));
//        }
//        return s.charAt(0) + removeDuplicate(s.substring(1));
//    }

    public static String removeDup(String s) {
        if (s.length() == 1 || s.length() == 0){
            return s;
        }
        String ans = "";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
//            for (int j = i+1; j < s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)){
//                    c++;
//                }
            int t = i;
            ans = ans + s.charAt(i);
            if(i < s.length()-1) {
                while(s.charAt(t) == s.charAt(t + 1)) {
                    if (c < s.length()-1)
                        c++;
                    if (t < s.length()-1)
                        t++;
                }
            }
            if (i+c < s.length()-1) {
                i = i + c;
                c = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(removeDuplicate(s));
        System.out.println(removeDup(s));
    }
}
