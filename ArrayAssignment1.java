package codingNinjaCourse;

import java.util.Scanner;

public class ArrayAssignment1 {

    public static int[] inputs(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Size of the Array:");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n ; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static int unique(int ar[]) {
        Scanner sc = new Scanner(System.in);
        int t= 0;
        for (int i = 0; i < ar.length; i++) {
            int c = 0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    c++;
                }
            }
            if(c == 1) {
                t = ar[i];
            }
        }
        return t;
    }

    public static int duplicate(int ar[])
    {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] == ar[j]){
                    t = ar[i];
                    break;
                }
            }

        }
        return t;
    }

//    public static void printElements(int[] t){
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(t[i] + " ");
//        }
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar[] = inputs();
//            unique(ar);
//            printElements(ar);
//            System.out.println(unique(ar));
            System.out.println(duplicate(ar));
            System.out.println();
        }
    }
}
