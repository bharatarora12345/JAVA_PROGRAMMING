package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean CheckPalindrome(String str , int f , int l){
        if (str.length() == 0){
            return true;
        }
        if (str.length() == 1){
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        if (f < l+1){
            return CheckPalindrome(str,f+1,l-1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(CheckPalindrome(str , 0 ,str.length()-1));

    }
}
