package string2Darray;

import java.util.Scanner;

public class stringPalindrome {

    public static boolean isPalindrome(String s1){
        String s2 = "";
        for (int i = s1.length()-1; i >= 0 ; i--) {
            s2 +=  s1.charAt(i);
        }
        if (s1.equals(s2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
