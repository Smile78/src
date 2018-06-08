package sol_23_03_Posl_Sort;

import java.util.Scanner;

public class I_nearest10_v2 {

//    1) Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//    Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45

    public static void main(String[] args) {
        double m  ;
        double n  ;

        Scanner inpKlv = new Scanner(System.in);
        System.out.print("Введите m:");
        m = inpKlv.nextInt();
        System.out.print("Введите n:");
        n = inpKlv.nextInt();

        if (m < 0 && n < 0) {
            if (m < n) {
                System.out.println("n , ближе к десяти");
            } else System.out.println("m , ближе к десяти");
        }
        if (m == n) System.out.println("по барабану");

        if (m > 10 && n > 10) {
            if (m > n) {
                System.out.println("n , ближе к десяти");
            } else System.out.println("m , ближе к десяти");
        }
        if (m < 10 && n < 10 && m > 0 && n > 0) {
            if (m > n) {
                System.out.println("m , ближе к десяти");
            } else System.out.println("n , ближе к десяти");
        }
        if (m==n&&m==10)System.out.println("по барабану");
        if (m>10&&n<10) {
            double x1=m-10;
            double x2=10-n;
            if (x1>x2) System.out.println("n ближе");
        }
        if (n>10&&m<10) {
            double x1=10-n;
            double x2=10-m;
            if (x2>x1) System.out.println("m ближе");
        }

    }
}



