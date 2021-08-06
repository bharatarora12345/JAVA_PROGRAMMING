package Recursion;

import java.util.Scanner;

public class CheckAB {
    public static void checkAB(String s){
        if (s.length() == 0){
            System.out.println(false);
        }
        if (s.length() == 1){
            if (s == "a"){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
        if (s.charAt(0) == 'a') {
            if (s.charAt(1) == 'a') {
                checkAB(s.substring(2));
            }
            if (s.charAt(0) == 'b') {
                if (s.charAt(1) == 'b') {
                    checkAB(s.substring(3));
                }
            }

        }else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        checkAB(str);
    }
}
