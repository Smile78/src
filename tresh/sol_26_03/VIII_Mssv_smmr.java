package tresh.sol_26_03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class VIII_Mssv_smmr {

    //8) Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
    // чтобы задавать каждому ученику пример из таблицы умножения, но
    // в классе 15 человек,
    // а примеры среди них не должны повторяться.
    // В помощь учителю напишите
    // программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9,
    // потому что задания по умножению на 1 и на 10 — слишком просты).
    // При этом среди 15 примеров не должно быть повторяющихся
    // (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).


    public static void main(String[] args) {
        int arr1[] = new int[9];
        int arr2[] = new int[9];
        int mn1=0;

        ArrayList<String>        list1txt = new ArrayList<String>();
        HashMap<String, Integer> tabl1    = new HashMap<String, Integer>();
       // tabl1.put("1*2=",2);

        for (int i = 1; i < 10; i++)
            for (int j = 1; j < 10; j++)

            { if (i!=j)
                {String str1 = Integer.toString(i);
                 String str2 = Integer.toString(j);
                 String str3 = str1.concat("*").concat(str2);  //.concat("=")
                   mn1=i*j;
                      for (int k=0;k<list1txt.size();k++) {
                         if (!str3.equals(list1txt.get(k)));{

                                      tabl1.put(str3, mn1);
                         }
                      }
                     list1txt.add(str3);//
            } }
        System.out.println(tabl1.entrySet());


    }
}
