package string2Darray;

import java.util.Scanner;

public class removeChar {

    public static String remChar(String s , char c){
        String news1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c){
                news1 += s.charAt(i);
            }
        }
        return news1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(remChar(s1,c));
    }

}