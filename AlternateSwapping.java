package codingNinjaCourse;

import java.util.Scanner;

public class AlternateSwapping {
//    public static void swapPairs(int[] a){
//        int len=a.length;
//        if(len%2 ==0){
//            for(int i=0; i<len; i=i+2){
//                int c=a[i]+a[i+1];
//                a[i]=c-a[i];
//                a[i+1]=c-a[i+1];
//            }
//        }
//        if(len%2 !=0){
//            for(int j=0; j<len-1; j=j+2){
//                int c=a[j]+a[j+1];
//                a[j]=c-a[j];
//                a[j+1]=c-a[j+1];
//            }
//            a[len-1]=a[len-1];
//        }
//    }
    public static void printArray(int[] a){
        int len=a.length;
        for(int i=0;i<len;i++)
            System.out.print(a[i]+" ");
    }

    public static int[] takeinput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    public static int[] swap(int[] ar) {
        int size = ar.length;
        if(size % 2 == 0){
            for (int i = 0; i < size; i+=2) {
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }}
        if (size % 2 != 0) {
            for (int i = 0; i < size - 1; i += 2) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
            ar[size - 1] = ar[size - 1];
        }
//                int[] b = {ar[i] + ar[i+1] + a[size-1]};

        return ar;
    }

    public static void printelements(int ar[]){
        for (int i = 0; i < ar.length ; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int t = sc.nextInt();
        while (t > 0){
            int ar[] = takeinput();
            swap(ar);
            printelements(ar);
            System.out.println();
        }
    }
}
