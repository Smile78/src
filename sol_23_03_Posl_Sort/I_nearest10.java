import java.util.Scanner;

public class I_nearest10 {

//    1) Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//    Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45

        public static void main (String [] args){
            double m =-8.45 ;
            double n =11.45;
            double x =10.00;

            double m1 ;
            double n1 ;

            if (m>=10)
                m1=m-x;
            else
                m1=x-m;
            System.out.println("дельта m: "+m1);

            if (n>=10)
                n1=n-x;
            else
                n1=x-n;
            System.out.println("дельта n: "+n1);

            if (m1>n1)
                System.out.println("n ближе к 10 ");
            else if (m1==n1)
                System.out.println("нефига не разобрать, нужны эксперименты") ;
            else
                System.out.println("m ближе к 10 ");

        }
    }



