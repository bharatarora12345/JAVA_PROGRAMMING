package codingNinjaCourse.Sorting;

import java.util.Scanner;

public class MergeSecondMethod {

    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static int[] merge(int ar1[] , int ar2[]){
        int len = ar1.length+ar2.length;
        int ar3[] = new int[len];
        int i=0,j=0 , k=0;
        while (i < ar1.length  && j < ar1.length){
            if (ar1[i] <= ar2[j]){
                ar3[k] = ar1[i];
                i++;
                k++;
            }else{
                ar3[k] = ar2[j];
                j++;
                k++;
            }
        }
        while (i < ar1.length){
            ar3[k] = ar1[i];
            k++;
            i++;
        }
        while (j < ar2.length){
            ar3[k] = ar2[j];
            k++;
            j++;
        }
        return ar3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar1[] = inputs();
            int ar2[] = inputs();
            int ar3[] = merge(ar1,ar2);
            for (int i = 0; i < ar3.length; i++) {
                System.out.print(ar3[i] + " ");
            }
            t--;
        }
    }
}
