package string2Darray;

import java.util.Scanner;

public class reverseWordWise {

    public static void reverseWordWise(String s){
        String s2 = "";
        int a = 0;
        int b = s.length();
        for (int i = s.length()-1; i >= 0; i--) {
            if ( s.charAt(i) == ' ' || i == 0){
                if (i == 0){
                    s2+= " ";
                }
                a = i;
                s2+=s.substring(a,b);
                b = a;
            }
        }
        System.out.print(s2);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        reverseWordWise(s);
    }
}
