package sol_23_03;

import java.util.Scanner;

public class IV_2_sort2 {


//    4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//    Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность
//    a, b и c оказалась строго возрастающей.




    public static void main(String[] args) {
        int ch, a1, a2,b1;
        int cnt=0;

        Scanner inpKlv = new Scanner(System.in);

        System.out.print("Введите кол-во чисел для сортировки :");
        ch = inpKlv.nextInt();

        int[] mas1 = new int[ch];

            for (int i = 0; i < ch; i++) {
                System.out.print("Введите очередное число:");
                mas1[i] = inpKlv.nextInt();
             }


        for (int j=0;j<mas1.length/2;j++) {
            for (int i = 0; i < mas1.length - 1; i++) {

                a1 = mas1[i];
                a2 = mas1[i];
                b1 = mas1[i + 1];

                if (b1 <= a1) {
                    mas1[i] = b1;
                    mas1[i + 1] = a2;
                }
            }
        }



        for (int i=0;i<mas1.length;i++) {
            System.out.print(" " + mas1[i]);
        }

    }
}
