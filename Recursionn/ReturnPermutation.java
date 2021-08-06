package Recursion;

import java.util.Scanner;

public class ReturnPermutation {
    public static void Permutation(String str , int l , int r){
        if (l == r){
            System.out.println(str + " ");
            return;
        }
        for (int i = l; i <= r;i++) {
            str = swap(str,l,i);
            Permutation(str,l+1,r);
            str = swap(str,l,i);
        }
    }
    public static String swap(String a, int i , int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Permutation(s , 0 , s.length() -1 );
    }
}
