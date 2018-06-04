package sol_23_03;

public class ccl_3_posl_20 {

//3) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….



    public static void main(String[] args) {

        int x = 1;
         int y =0;

    do {
        x = x*2 ;
        System.out.println("X:  "+x);
        y=y+1;
    }
    while (y<20);

        System.out.println(" ");
        System.out.println("кол-во чисел: " + y);
    }
}