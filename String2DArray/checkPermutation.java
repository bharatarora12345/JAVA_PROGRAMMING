package string2Darray;

import java.util.Scanner;

public class checkPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int c = 0;
        if (s1.length() == s2.length()){
            for (int i = 0; i < s1.length() ; i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)){
                        c++;
                    }
                }
                if (c == 0){
                    System.out.println("false");
                    break;
                }
                else {
                    System.out.println("true");
                    break;
                }
            }
        }
    }
}
