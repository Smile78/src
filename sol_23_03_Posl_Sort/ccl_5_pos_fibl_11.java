package sol_23_03;

import java.util.ArrayList;
import java.util.List;

public class ccl_5_pos_fibl_11 {

//5) Выведите на экран первые 11 членов последовательности Фибоначчи. Первый и второй члены последовательности равны единицам,
// а каждый следующий — сумме двух предыдущих.


    public static void main(String[] args) {

        int x=1;
        int[] psl = new int[12];
        psl[0] = 0;
        psl[1] = 1;

        for (int i=0; i<10;i++){
            psl[i+2] = psl[i ]+psl[i+1];
        }

        for (int i=1; i<12;i++){
            System.out.print ("номер " + (x++)+" ");
            System.out.println ("числа  фибанчаччи: " + psl[i] );
        }

    }
}