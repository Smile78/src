import java.lang.String;
public class ccl_1_posl {
   // //1) Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

    public static void main(String[] args) {

         int x = 850;
         int kol;
         int y =0;

    do {x = x + 3;
        kol = String.valueOf(x).length();//кол-во цифр в числе

        if (kol>3&&kol<5)
          {System.out.print("x: " + x +" ");
              y=y+1;}
       }

    while (x<20000);
        System.out.println(" ");
        System.out.println("y: " + y);


    }
}