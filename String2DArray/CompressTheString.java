package string2Darray;

import java.util.Scanner;

public class CompressTheString {

    public static void compressString(String s1){
        String s2 = "";
        int count = 1;
        int j = 0;
        s1 = s1.replace(" " , "");
        for (int i = 0; i < s1.length()-1; i++) {
                while(s1.charAt(i+1) == s1.charAt(i)) {
                    count++;
                    if ((i+1) < s1.length()-1) {
                        i++;
                    } else {
                        break;}
                }
            if (count == 1){
                System.out.print(s1.charAt(i));
            }else{
            System.out.print(s1.charAt(i) + "" + count);}
            count=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1  = sc.nextLine();
        compressString(s1);
    }
}
