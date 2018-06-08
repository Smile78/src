package sol_23_03_Posl_Sort;

public class ccl_2_posl_obr {

//    2) Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….



    public static void main(String[] args) {

        int x = 95;
        int y =0;

    do {
        x = x - 5;
        System.out.println("X:  "+x);
        y=y+1;
    }
    while (x>0);

        System.out.println(" ");
        System.out.println("кол-во чисел: " + y);
    }
}