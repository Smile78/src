//  8) Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил
// начинать каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения,
// но в классе 15 человек, а примеры среди них не должны повторяться.
// В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров
//  из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
//   При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары
//   считать повторяющимися).

package sol_26_03_Mssv;

public class VIII_Mssv_v1_tabl_mlty {

    public static void main(String[] args){

              int[] arr1=new int[36];
        String[] arr3str=new String[36];

        int p=0;
        int f=0;

              int[] arr36=new int[36];
             int[] arr362=new int[36];
              int[] arr15=new int[15];


        for (int x=2;x<=9;x++){
                    for (int c=2;c<=9;c++){
                         if (x<=c){
                           arr1[p++]=x*c;

                               String strcx = Integer.toString(x);
                                String strc = Integer.toString(c);
                               arr3str[f++] = strcx.concat("*").concat(strc).concat("=");
                         }
                     }
                 }

                 //15 случ. примеров
            for (int i = 0; i < 15; i++){
                 int b = (int)(Math.random()*36+1);
                    System.out.println( arr3str[b]+arr1[b]);
            }


    }
}

