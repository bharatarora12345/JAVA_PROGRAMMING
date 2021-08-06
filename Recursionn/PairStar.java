package Recursion;

import java.util.Scanner;

public class PairStar {
    public static String pairStar(String s){
        if (s.length() == 1){
            return s;
        }
        if (s.charAt(0) == s.charAt(1)){
            String smallAns = pairStar(s.substring(1));
            return s.charAt(0) + "*" + smallAns;
        }else
        {
            String smallAns = pairStar(s.substring(1));
            return s.charAt(0) + smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pairStar(s));
    }
}
