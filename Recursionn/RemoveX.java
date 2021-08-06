package Recursion;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String s){
        if (s.length() == 0){
            return s;
        }
//        if (s.charAt(0) == 'x'){
//            String smallAns = removeX(s.substring(1));
//            return smallAns;
//        }else {
//            String smallAns = removeX(s.substring(1));
//            return s.charAt(0) + smallAns;
//        }
        String ans = "";
        if (s.charAt(0) != 'x'){
            ans = ans + s.charAt(0);
        }
        String smallAns = removeX(s.substring(1));
        return ans + smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeX(s));
    }
}
