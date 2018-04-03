public class Figurs {
// //Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты. Все фигуры должны иметь методы,
// //   которые возвращают площадь и периметр (для окружности - длина окружности).
  double x1 ;
   double y1;
    double z1;
////
       double p;
         String str3;


    Figurs(double  x) {                // констр круга
        x1 = x;//radius
    }

    Figurs(double  y, double  z) {      // констр прямоуг и треуг
        y1 = y;//высота
        z1 = z;//длина основания
    }



            public  void square1(double pii){                            // метод площадь круга
               p= pii;
                System.out.println("площадь круга: "+Math.pow(p*x1,2));
            }
            public  void square1(){                                     // метод площадь прямоуг
                System.out.println("площадь прямуг: "+y1*z1);
            }
            public  void square1(String s1, String s2){                 // метод площадь треуг
                    str3=s1.concat(s2);
                System.out.println("площадь "+str3+0.5*y1*z1);
            }

    public  void Permtr(double pii){                            // метод длина окр круга
        p= pii;
        System.out.println("длина окружности"+2*p*x1);
    }
    public  void Permtr(){                                     // метод периметр прямоуг
        System.out.println("периметр прямуг: "+(y1+z1)*2);
    }
    public  void Permtr(String s1, String s2){                 // метод периметр равнстр треуг
        str3=s1.concat(s2);
        System.out.println("периметр равнстр треуг "+2*Math.sqrt(3*y1));
    }


    public static void main(String[] args) {
        Figurs crcl=new Figurs(24.34);
        Figurs rect=new Figurs(12.23,22.34);
        Figurs triangl=new Figurs(21.23,34.56);

            crcl.square1(Math.PI);
            rect.square1();
            triangl.square1("тре","угольника: ");

        crcl.Permtr(Math.PI);
        rect.Permtr();
        triangl.Permtr("тре","угольника: ");



    }
}
