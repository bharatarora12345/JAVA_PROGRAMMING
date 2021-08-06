package string2Darray;

import java.util.Scanner;

public class reverseEachWord {

    public static String revWord(String s){
        String s1 = "";
        int k=0 , t = 0 ,c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                k = i;
                c++;
                for (int j = k-1; j >= t ; j--) {
                    s1 = s1 + s.charAt(j);
                }
                if (c == 1){
                    s1=s1+" ";
                }
                t = k;
            }
        }
        for (int j = s.length()-1; j > k ; j--) {
            s1 = s1+s.charAt(j);
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(revWord(s1));
    }
}
