package Recursion;
import java.util.Scanner;

public class PresentOrNot {
    public static boolean elePre(int ar[] ,int l , int r , int search){
//        if (ar.length == 1){
//            if (ar[0] == search){
//                return true;
//            }
//        }
        if (r < 1){
            return false;
        }
        if (ar[l] == search){
            return true;
        }
        if (ar[r] == search){
            return true;
        }
        return elePre(ar,l+1 , r-1 , search);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        boolean ans = elePre(ar,0 , ar.length-1 , search);
        System.out.println(ans);
    }
}
