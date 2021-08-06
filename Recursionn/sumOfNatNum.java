package Recursion;

public class sumOfNatNum {
    public static int summ(int n){
        if (n == 1){
            return 1;
        }
        int sum2 = summ(n-1);
        return n + sum2;
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = summ(n);
        System.out.println(sum);
    }
}
