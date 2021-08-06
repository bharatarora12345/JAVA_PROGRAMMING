package codingNinjaCourse;

import java.util.Scanner;

public class Arrayspractice {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int largestElement(int arr[]) {
        int max = arr[0], min = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (max <= arr[j]) {
                    max = arr[j];
                } else {
                    min = arr[j];
                }
            }
        }
        return max;
    }

    public static int sum(int arr[]) {
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to execute");
        int t = sc.nextInt();
        while (t > 0) {
            int arr[] = takeInput();
//            print(arr);
            System.out.println(sum(arr));
            t--;
        }
    }
}
