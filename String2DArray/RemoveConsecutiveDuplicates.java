package string2Darray;

import java.util.Scanner;
import java.lang.String;

public class RemoveConsecutiveDuplicates {
    public static String remDup(String s){
        String s2 = "";
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                s2+=s.charAt(i);
                i++;
            }
            else{
                s2+=s.charAt(i);
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(remDup(s1));
    }
}
