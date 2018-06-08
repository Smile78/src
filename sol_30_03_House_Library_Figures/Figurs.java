package sol_30_03_HLF;

public class Figurs {
// //Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты. Все фигуры должны иметь методы,
// //   которые возвращают площадь и периметр (для окружности - длина окружности).
  double x1 ;
   double y1;
    double z1;


    double a2;
        double b2;

//
       double p;
         String str3;


    Figurs(double  x) {                // констр круга
        x1 = x;//radius
    }

    Figurs(double  y, double  z) {      // констр прямоуг
        y1 = y;//высота
        z1 = z;//длина основания
    }

    Figurs(double  a,double  b, int  Cpensil) {      // констр   треуг
        a2 = a;//b
        b2 = b;//b
    }

            public  void square1(double pii){                            // метод площадь круга
                p= pii;
                System.out.println("площадь круга: "+ p*Math.pow(x1,2));
            }

            public  void square1(){                                     // метод площадь прямоуг
                System.out.println("площадь прямуг: "+y1*z1);
            }

            public  void square1(String s1, String s2,String s3){     // метод площадь  треуг
                str3=s1.concat(s2).concat(s3);
                double c = Math.sqrt(a2*a2+b2*b2);
                double p=0.5*(a2+b2+c);
                double S=Math.sqrt(p*(p-a2)*(p-b2)*(p-c));
                 System.out.println("площадь треуголльника "+ S);

            }

    public  void Permtr(double pii){                            // метод длина окр круга
        p= pii;
        System.out.println("длина окружности: "+2*p*x1);
    }
    public  void Permtr(){                                     // метод периметр прямоуг
        System.out.println("периметр прямуг: "+(y1+z1)*2);
    }


    public  void Permtr(String s1, String s2, String s3){                 // метод периметр  треуг
        str3=s1.concat(s2).concat(s3);
        double c = Math.sqrt(a2*a2+b2*b2);
        System.out.println("периметр   "+str3+(a2+b2+c));
    }


    public static void main(String[] args) {
        Figurs crcl=new Figurs(2.3);
        Figurs rect=new Figurs(2.6,2.1);
        Figurs triangl=new Figurs(10.00,12.00,666);

            crcl.square1(Math.PI);
            rect.square1();
            triangl.square1("тре","уголь","ника: ");

        crcl.Permtr(Math.PI);
        rect.Permtr();
        triangl.Permtr("тре","уголь","ника: ");



    }
}
