package string2Darray;

import java.util.Scanner;

public class countWrods {

    public static int countWords(String s){
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countWords(s));
    }
}
