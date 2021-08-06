package codingNinjaCourse.Sorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        System.out.println("Enter all elements");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("How mant test cases you want");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("Which value you want to search");
            int a = sc.nextInt();
            int start = 0;
            int end = ar.length;
            int mid = (start + end) / 2;
            boolean flag = true;
                while (flag) {
                    if (end > start) {
                        mid = (start + end) / 2;
                        if (ar[mid] == a || end == start) {
                            flag = false;
                        }
                        if (ar[mid] > a) {
                            end = mid - 1;
                        } else if (ar[mid] < a) {
                            start = mid + 1;
                        }
                    } else {
                        mid = -1;
                        flag = false;
                    }
                }
            System.out.println(mid);
            t--;
        }
    }
}
