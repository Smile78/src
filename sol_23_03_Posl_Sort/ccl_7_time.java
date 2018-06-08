package sol_23_03_Posl_Sort;

import java.util.ArrayList;
import java.util.List;
//import java.io.*;

public class ccl_7_time {
    //7) Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
    // что слева от двоеточия показывается симметричная комбинация для той,
    // что справа от двоеточия (например, 02:20, 11:11 или 15:51).

    public static void main(String[] args) {
        List<Integer> hrs         = new ArrayList<Integer>();
        ArrayList<Integer> bkMnts = new ArrayList<Integer>();
        ArrayList<String>  eq1    = new ArrayList<String>();

        for (int i = 0; i < 24; i++) {
            hrs.add(i);
        }

        for (int j = 0; j < 60; j++) {
            int x1 = 0;
            int x2 = 0;
            int x3 = 0;

            int chsl2 = 0;
            int chsl1 = 0;

             x1 = (j % 10);
            String str1 = Integer.toString(x1);
             x2 = (j-x1)/10;
            String str2 =Integer.toString(x2);
            String strk1 = str1.concat(str2);
             x3 = Integer.parseInt(strk1);

            bkMnts.add(x3);
        }

        int cnt1=0;

   for (int i=0; i<hrs.size();i++){
  for (int j=0; j<bkMnts.size();j++) {
      if (hrs.get(i).equals(bkMnts.get(j))) {
          String str3 = Integer.toString(hrs.get(i));
          String str4 = Integer.toString(bkMnts.get(j));
          String strk5 = str3.concat(":").concat(str4);
          eq1.add(strk5);
          System.out.println(strk5);
          cnt1=cnt1+1;
      }
  }
  }
        System.out.println("cnt1: "+cnt1);
  }
}
