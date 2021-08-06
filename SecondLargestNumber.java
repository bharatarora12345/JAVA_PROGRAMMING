package codingNinjaCourse;

import java.util.Scanner;
import java.lang.Math;

public class SecondLargestNumber {

    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static void secondHighest(int ar[] ) {
//        int temp;
//        for (int i = 0; i <ar.length ; i++) {
//            for (int j = i+1; j < ar.length; j++) {
//                if (ar[i] >= ar[j]){
//                    temp = ar[i];
//                    ar[i] = ar[j];
//                    ar[j] = temp;
//                }
//            }
//        }
//        return ar[ar.length-2];
        int i, first, second;
        if (ar.length < 2) {
            System.out.println(" Invalid Input!! ");
            return;
        }
        int largest = second = Integer.MIN_VALUE;
        for (int j = 0; j < ar.length; j++) {
            largest = Math.max(largest, ar[j]);
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] != largest) {
                second = Math.max(second, ar[j]);
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is No second Largest Element");
        } else {
            System.out.println(second);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar[] = inputs();
            secondHighest(ar);
            t--;
        }
    }
}
