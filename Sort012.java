package codingNinjaCourse;

import java.util.Scanner;

public class Sort012 {
    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    public static int[] sort123(int ar[]){
        int zero = 0 , one = 0 , two = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == 1){
                one++;
            }
            else if (ar[i] == 2){
                two++;
            }
            else{
                zero++;
            }
        }
        for (int i = 0; i < zero; i++) {
            ar[i] = 0;
//            System.out.print(ar[i] + " ");
        }
        for (int i = zero; i <zero+one ; i++) {
            ar[i] = 1;
//            System.out.print(ar[i] + " ");
        }
        for (int i = zero+one; i < zero+ one + two; i++) {
            ar[i] = 2;
//            System.out.print(ar[i] + " ");
        }
        return ar;
    }
    public static void print(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar[] = inputs();
            sort123(ar);
            print(ar);
            t--;
        }
    }
}
