package Recursion;

import codingNinjaCourse.FindPowerOfNum;

public class  ArraySortedOrNot {
//    public static boolean Sorted(int ar[]){
//        if (ar.length <= 2){
//            return true;
//        }
//        int smallInput[] = new int[ar.length-1];
//        for (int i = 1; i < ar.length; i++) {
//            smallInput[i-1] = ar[i];
//        }
//        boolean smallAns = Sorted(smallInput);
//        if (!smallAns){
//            return false;
//        }
//        if (ar[0] <= ar[1]){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public static boolean CheckSorted(int ar[] , int startIndex){
        if (startIndex >= ar.length -1){
            return true;
        }
        if (ar[startIndex] > ar[startIndex+1]){
            return false;
        }
        boolean smallAns = CheckSorted(ar , startIndex +1);
        return smallAns;

    }


    public static void main(String[] args) {
        int ar[] = {1,1,8,5,6};
//        System.out.println(Sorted(ar));
        int start = 0;
        System.out.println(CheckSorted(ar , start));
    }
}
