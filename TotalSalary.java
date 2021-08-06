package codingNinjaCourse;

import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int totalSalary=0;
            int allow=0;
            int basicSalary= sc.nextInt();
            String grade= sc.nextLine();
            double hra= .20*basicSalary;
            System.out.println(hra);
            double da=  .50*basicSalary;
            System.out.println(da);
            int sum= (int)(basicSalary+hra+da);
            double pf=   .11*basicSalary;
            System.out.println(pf);
            if(grade == "A"){
                allow=1700;

                totalSalary = (int)(basicSalary+hra+da+(allow-pf));
                System.out.println(totalSalary);
            }

            else if(grade =="B") {
                allow = 1500;
                totalSalary = (int)((basicSalary + hra + da + allow)-pf);
                System.out.println(totalSalary);
            }
            else{
                allow=1300;
                totalSalary = (int)(basicSalary + hra + da + allow - pf);
                System.out.println(totalSalary);
            }


        }

    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Basic Salary and Grade :");
//        int bs = sc.nextInt();
////        String  grade = sc.nextLine();
//        char grade = sc.next().charAt(0);
//        double hra = bs * (1.0/5.0);
//        double da = bs * (1.0/2.0);
//        double pf = bs * (11.0/100.0);
//        double allow = 0;
//        double total = 0;
//        System.out.println("hra : " + String.format("%.1f",hra));
//        System.out.println("da : " + String.format("%.1f",da));
//        System.out.println("pf : " + String.format("%.2f",pf));
//        if (grade == 'A')
//        {
//            allow = 1700;
//        }
//        else if (grade == 'B')
//        {
//            allow = 1500;
//        }
//        else
//        {
//            allow = 1300;
//        }
//        System.out.println("allow : " + allow);
//
//        total = (bs + hra + da + allow - pf);
//        System.out.println( String.format("%.2f",total));
//        int totalSalary = (int) Math.round(total);
//        System.out.println("Total salary should be : " + totalSalary);
//    }
