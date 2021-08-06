package codingNinjaCourse;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the how many numbers you want to find average");
        int N = sc.nextInt();
        System.out.println("Enter the numbers whose you want average");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int avg = sum/N;
        System.out.println("Average is : " + avg);

    }
}
