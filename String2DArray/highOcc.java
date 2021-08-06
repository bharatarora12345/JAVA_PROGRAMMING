package string2Darray;

import java.util.Scanner;

public class highOcc {
    public static String highOcc(String s){
        String s1 = "";
        String s2 = "";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(i) ){
                c++;
            }
        }
        System.out.println(c);
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        highOcc(s);
    }
}

