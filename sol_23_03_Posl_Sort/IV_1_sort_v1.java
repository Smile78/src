package sol_23_03_Posl_Sort;

 import java.util.Scanner;

 import static java.util.Arrays.*;


public class IV_1_sort_v1 {

//    4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//    Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность
//    a, b и c оказалась строго возрастающей.


    public static void main(String[] args) {
        int a,b,c ;

        Scanner inpKlv = new Scanner(System.in);

        System.out.print("Введите кол-во чисел для сортировки :");
        a = inpKlv.nextInt();

        int[] mas1 = new int[a];

        for (int i=0; i<a;i++) {
            System.out.print("Введите очередное число:");
            mas1[i] = inpKlv.nextInt();
        }

         sort(mas1);
            for (int i=0;i<mas1.length;i++)
             System.out.print( " " +mas1[i]);

}
}
