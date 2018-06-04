package sol_23_03;

import java.util.Scanner;

public class IV_4_sort4 {


//    4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//    Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность
//    a, b и c оказалась строго возрастающей.

public static void swap1(int[] mas2) {
    for (int i = mas2.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (mas2[j] > mas2[j + 1]) {
                int swp = mas2[j];
                mas2[j] = mas2[j + 1];
                mas2[i + 1] = swp;
            }
        }
    }
}

    public static void swap2(int[] mas3) {

        for (int i = 0; i<mas3.length  ;    i++) {

            int min = mas3[i];
            int min_nmbr_i = i;

            for (int j = i+1; j < mas3.length ; j++) {

                if (mas3[j] < min) {
                    min = mas3[j];
                    min_nmbr_i= j;
                }
            }

            if (i != min_nmbr_i) {
                int tmp = mas3[i];
                mas3[i] = mas3[min_nmbr_i];
                mas3[min_nmbr_i] = tmp;
            }
        }
    }

    private static void printMF(int[] mas3) {

        for (int i = 0; i < mas3.length; i++) {
            System.out.print(" " + mas3[i]);
        }
    }


    public static void main(String[] args) {
        int ch;


        Scanner inpKlv = new Scanner(System.in);

        System.out.print("Введите кол-во чисел для сортировки :");
        ch = inpKlv.nextInt();

        int[] mas1 = new int[ch];

        for (int i = 0; i < ch; i++) {
            System.out.print("Введите очередное число:");
            mas1[i] = inpKlv.nextInt();
        }

//        swap1(mas1);// как минимум требует доработки
        swap2(mas1);

        printMF(mas1);
        }

    }

