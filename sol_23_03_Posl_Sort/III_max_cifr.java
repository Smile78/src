package sol_23_03_Posl_Sort;

import  java.util.Scanner;
import  java.util.ArrayList;

public class III_max_cifr {
///    ...выводящую на экран   наибольшую цифру любого трехзначного натурального числа.


      public static void main (String []args) {
          ArrayList<Integer> num1 = new ArrayList<Integer>();
          ArrayList<Integer> num2GrM = new ArrayList<Integer>();
          //ArrayList<Integer> chis1ost = new ArrayList<Integer>();


          Scanner inpKlv = new Scanner(System.in);

          // int a,b,c;
          // double [] num1 = new double[3];

          System.out.print("Введите a: ");
          num1.add(inpKlv.nextInt());
          System.out.print("Введите b: ");
          num1.add(inpKlv.nextInt());
          System.out.print("Введите c: ");
          num1.add(inpKlv.nextInt());


          for (int i = 0; i < num1.size(); i++) {
              int chis1 = num1.get(i);
             // System.out.print("chis1 "+chis1);

              int kol = String.valueOf(chis1).length();//кол-во цифр в числе
              //System.out.print("kol "+kol);

              int chis1a2=0;
              chis1a2 =chis1;

              for (int j = 0; j < kol; j++) {
                 int a= chis1a2 % 10;
                  num2GrM.add(a);
                  System.out.println("a"+a);
                    chis1a2= Math.round(chis1a2/10);
             }
            }
          int max=0;

          for (int i = 0; i < num2GrM.size(); i++) {

              int tek = num2GrM.get(i);
              if (tek > max) max = tek;
          }
          System.out.println("max "+max);
      }
    }
