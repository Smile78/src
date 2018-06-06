package sol_26_03;

import java.util.Scanner;


public class VI_Mssv4_scanner {
    // 6) Пользователь должен указать с клавиатуры чётное положительное число,
    // а программа должна создать массив указанного размера
    // из случайных целых чисел из [-5;5] и вывести его на экран в строку.
    // После этого программа должна определить и сообщить пользователю
    // о том, сумма модулей какой половины массива больше: левой или правой,
    // либо сообщить, что эти суммы модулей равны.
    // Если пользователь введёт неподходящее число, то программа должна
    // требовать повторного ввода до тех пор, пока не будет указано корректное значение.
    //
    //Понадобится класс Scanner, например:
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Введите число | строку и тп");
    //int i = sc.nextInt(); для числа
    //String str = sc.nextLine(); для строки

    public static int input() {
        int i;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите четное  число от 4 до 12");
                i = sc.nextInt();       //для числа
            if (i < 4 || i > 12&&i%2==0) {
                System.out.println("ой я умоляю Введите  четное  число от 4 до 12");
            }
        }
            while (i < 4 || i > 12&&i%2==0);
                return i;
    }

    public static int[] fill(int[] arr1,int b){
        for (int i=0; i<b;i++){
            arr1[i]= (int)((Math.random()*11)-5);
        }
        return arr1;
    }


    private static void check(int[] arr1,int b) {
       int sum1=0;
       int sum2=0;

        for (int i=0; i<b/2;i++) {
           sum1=sum1+Math.abs(arr1[i]);
        }
        System.out.println(" " );
        System.out.println(" sum1: "+sum1);

        for (int i=b-1; i>=b/2;i--) {
            sum2=sum2+Math.abs(arr1[i]);
        }
        System.out.println(" " );
        System.out.println(" sum2: "+sum2);

        if (sum1>sum2) System.out.println("левая часть больше");
        else System.out.println("правая чась больше");
    }

    //------------MAIN----------------


        public static void main(String[] args) {
            int b= input();
            int[] arr1 = new int[b];

         fill(arr1,b);

        for(int ech:arr1){
            System.out.print (" "+ech);
        }

        check(arr1,b);
        }
}