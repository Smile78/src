public class II_kv_koren {
    //2) В три переменные a, b и c записаны три вещественных числа.
    // Создать программу, которая будет находить и выводить на экран
    // вещественные корни квадратного уравнения ax^2+bx+c=0, либо сообщать, что корней нет.

    public static void main (String [] args){
      double a=1.23;
      double b=3.435;
      double c=4.34;

      double x=5.12;
      double d=-1.00;
      double x1=0.00;
      double x2=0.00;
      double m=-1.00;


      /* ax^2+bx+c=0
        d=b^2-4ac
         D>0
           x1 = (-b +d^1/2)2a
           x2 = (-b -d^1/2)2a
                D=0
                 x1 = (-b)2a
                    D<0 нету...
        */
        d=b*b-4*a*c;
        System.out.println("Дейскриминант D= "+d);

       if (d>=0){
        m=Math.pow(Math.abs(d),0.5);//m=модуль d^0.5
                                    //System.out.println(" m= "+m);
            x1= (-b +m)*2*a;
            x2= (-b -m)*2*a;
        System.out.println("x1: "+x1+" "+"x2: "+x2);
       }
        else
        System.out.println("...зимой я не гуляю...  d<0...");
    }
}
