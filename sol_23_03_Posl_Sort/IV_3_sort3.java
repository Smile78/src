package sol_23_03_Posl_Sort;

import java.util.Scanner;

public class IV_3_sort3 {


//    4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//    Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность
//    a, b и c оказалась строго возрастающей.

    private static void swap1(int[] mas2) {
        for (int j = 0; j < mas2.length / 2; j++) {
            for (int i = 0; i < mas2.length - 1; i++) {

                int a1 = mas2[i];
                int a2 = mas2[i];
                int b1 = mas2[i + 1];

                if (b1 <= a1) {
                    mas2[i] = b1;
                    mas2[i + 1] = a2;
                }
            }
        }
    }

    private static void printMF(int[] mas3) {

        for (int i = 0; i < mas3.length; i++) {
            System.out.print(" " + mas3[i]);
        }
    }

    public static void main(String[] args) {
        int ch ;

        Scanner inpKlv = new Scanner(System.in);

        System.out.print("Введите кол-во чисел для сортировки :");
        ch = inpKlv.nextInt();

        int[] mas1 = new int[ch];

        for (int i = 0; i < ch; i++) {
            System.out.print("Введите очередное число:");
            mas1[i] = inpKlv.nextInt();
        }

            swap1(mas1);
            printMF(mas1);

    }
}
