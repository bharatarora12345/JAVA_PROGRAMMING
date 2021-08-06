package codingNinjaCourse;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[10];
        int index = 0;
        while(n >= 1){
            a[index] = n%2;
            n = n/2;
            index++;
        }
        for (int i = index-1; i >=0 ; i--) {
            System.out.print(a[i]);
        }
    }
}
