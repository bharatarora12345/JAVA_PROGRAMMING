package codingNinjaCourse;

import java.util.Scanner;

public class CheckArrayRotation {
    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static int rotateArray(int ar[]){
        int c =1;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] >= ar[i+1]){
                break;
            }else{
                c++;
                if (c == ar.length){
                    c = 0;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar[] = inputs();
            System.out.println(rotateArray(ar));
            t--;
        }
    }
}
