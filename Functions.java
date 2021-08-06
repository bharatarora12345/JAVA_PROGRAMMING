package codingNinjaCourse;


import java.util.Scanner;

public class Functions {
    public static void demo(int a, int b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        demo(a,b);
    }

//    public static int fact(int n){
//        int a = 1;
//        for (int i = 1; i <= n; i++) {
//            a = a * i;
//        }
//        return a;
//    }
//    public static void printNum(int n){
//        if (n <= 0){
//            return;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(i + " ");
//        }
//    }
//    public static boolean isPrime(int n){
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int a = fact(n);
//        int b = fact(r);
//        int c = fact(n-r);
//        boolean ansPrime = isPrime(13);
//        int ans = a / (b * c);
//        System.out.println(ans);
//        System.out.println(ansPrime);
//        printNum(10);
//    }
}
