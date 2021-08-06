package string2Darray;

import codingNinjaCourse.Sorting.InsertionSort;

import java.util.HashMap;
import java.util.Scanner;

public class HighestOcuurence {

//    public static void highestOccurence(String s){
//        HashMap<Character,Integer> count = new HashMap<Character, Integer>();
//        char[] strArray = s.toCharArray();
//        for (char c : strArray) {
//            if (count.containsKey(c)){
//                count.put(c,count.get(c)+1);
//            }else{
//                count.put(c,1);
//            }
//        }
//        System.out.println(s + " : " + count);
//    }
//
//    public static void highestOccurence2(String s1){
//        int count[] = new int[256];
//        int len = s1.length();
//        for (int i = 0; i < len; i++) {
//            count[s1.charAt(i)]++;
//        }
//
//        char ch[] = new char[s1.length()];
//        for (int i = 0;  i<len ; i++) {
//            ch[i] = s1.charAt(i);
//            int find = 0;
//            for (int j = 0; j <= i; j++) {
//                if (s1.charAt(i) == ch[j]){
//                    find++;
//                }
//            }
//            if (find == 1){
//                System.out.println("Highest Occurence of " + s1.charAt(i) + " is :" + count[s1.charAt(i)]);
//            }
//        }
//    }
//    public static void freqCount(String str){
////        String s1 = "";
//        str = str.replace(" " , "");
//        while (str.length() > 0){
//            char ch = str.charAt(0);
//            System.out.println(ch + " " + countChar(str,ch));
////            s1+=(ch + countChar(str,ch));
//            str = str.replace("" + ch,"");
//        }
////        for (int i = 0; i < s1.length(); i++) {
////            System.out.print(s1.charAt(i));
////        }
//    }
//
//    public static int countChar(String str , char ch){
//        int count =0;
//        while (str.indexOf(ch) != -1){
//            count++;
//            str=str.substring((str.indexOf(ch)+1));
//        }
////        char countt = (char)count;
////        return countt;
//        return count;
//    }

    public static void highOcc(String s1){
        String s2 = "";
        String arr[] = new String[s1.length()];
        int count = 1;
        int j = 0,k=0;
        s1 = s1.replace(" " , "");
        for (int i = 0; i < s1.length()-1; i++) {
            while(s1.charAt(i+1) == s1.charAt(i)) {
                count++;
                if ((i+1) < s1.length()-1) {
                    i++;
                } else {
                    break;}
            }
            arr[k] = Integer.toString(count);
            if (count == 1){
                System.out.print(s1.charAt(i));
            }else{
                System.out.print(s1.charAt(i) + "" + count);}
            count=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
//        highestOccurence(s1);
//        highestOccurence2(s1);
//        freqCount(s1);
    }
}
