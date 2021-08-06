package codingNinjaCourse;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    public static int[] sums(int ar1[], int ar2[]) {
        int temp = 0;
        int temp2 = 0;
        int sum[] = new int[ar1.length + 1];
//        if (ar1.length >= ar2.length) {
            for (int i = ar1.length - 1; i >= 0; i--) {
                if (ar2[i] == 0) {
                    temp = ar2[i];
                    ar2[i] = ar2[i - 1];
                    ar2[i - 1] = temp;
                }
                sum[i + 1] = ar1[i] + ar2[i] + temp2;
                if (sum[i + 1] >= 10) {
                    if (i != 0) {
                        temp2 = sum[i + 1] / 10;
                        sum[i + 1] = sum[i + 1] % 10;
                    }
                }
            }
//        }
            return sum;
    }
    public static void print(int sum[]){
        for (int i = 0; i < sum.length ; i++) {
            System.out.print(sum[i] + " ");
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar1[] = inputs();
            int ar2[] = inputs();
            int sum[] = sums(ar1,ar2);
            print(sum);
            t--;
        }
    }
}
