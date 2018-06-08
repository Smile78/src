package sol_30_03_House_Library_Figures.houseX;


import java.util.ArrayList;
import java.util.Random;

public class Home {

    static int podezd;
    static int etage;
    static int kvartNaEtag;
    static String adress;



    Home(int podezd, int etage, int kvartNaEtag, String adress  ) {
        this.podezd=podezd;
        this.etage=etage;
        this.kvartNaEtag=kvartNaEtag;
        this.adress=adress;

    }

    public  static int  skokaKvrt() {
        return kvartNaEtag*podezd*etage ;
    }

    public static void showAdress() {
        System.out.println("Адрес дома: "+adress);
    }

    private static Human[] fillHuman(int humansKol, Human[] human) {

        for (int i=0;i<humansKol;i++) {
            Random r = new Random();
            char c1 = (char) (r.nextInt(26) + 'A');
            String abrv1 = String.valueOf(c1);
            char c2 = (char) (r.nextInt(26) + 'A');
            String abrv2 = String.valueOf(c2);
            char c3 = (char) (r.nextInt(26) + 'A');
            String abrv3 = String.valueOf(c3);

            String abrvFIO = abrv1.concat(abrv2).concat(abrv3);

//           System.out.println(abrvFIO);
            int etgnst=((int)(Math.random()*8)+1);// тут вот вообще не понятно почему на 9 этаж никому никогда не въехать :( вобщем 9 пентхаус
            human[i]=new Human(abrvFIO,etgnst);//  фио этажнсть
        }
        return human ;
    }

    public static ArrayList  svobodny(Human[] human,int[] gelaushih,ArrayList<String> luserArray,ArrayList<String> citizens ) {

        for (int i = 0; i < human.length; i++) {
            for(int e=1;e<=etage;e++) {
                if (human[i].etage == e) {
                    gelaushih[e]++;
                    if (gelaushih[e] <= podezd * kvartNaEtag) {
                        citizens.add(human[i].fio);
                    }
                    if (gelaushih[e] > podezd * kvartNaEtag) {
                        luserArray.add(human[i].fio);
                    }
                }
            }
        }

//         for(String ech:luserArray) {
//        System.out.println("Кому не достались квартиры " + luserArray );
//         }

    return luserArray;
    }

    public static void Vmestimost(ArrayList  citizens) {
        System.out.println( " Въехали счастливые граждане с музычкой и цыганами: "+citizens);
    }


     public static void main (String [] args) {

         Home home = new Home(2, 9, 2, "Komedantsky pr. 40");

         int humansKol =42;
         Human[] human = new Human[humansKol];
         int[] gelaushih = new int[etage];

//         human[0] = new Human("NAS", 5);
//         human[1] = new Human("ZOO", 5);
//         human[2] = new Human("NSS", 5);
//         human[3] = new Human("NNN", 5);
//         human[4] = new Human("BAI", 5);
//         human[5] = new Human("xxx", 5);
//         human[6] = new Human("ZIO", 1);
//         human[7] = new Human("ZSO", 1);
//         human[8] = new Human("zzz", 1);
//         human[9] = new Human("ppp", 5);
//         human[10] = new Human("fff", 1);
//         human[11] = new Human("ccc", 1);

         ArrayList<String> citizens = new ArrayList<>();
         ArrayList<String> luserArray = new ArrayList<>();

         human= fillHuman(humansKol,human);

         showAdress();
         System.out.println("Всего квартир: "+skokaKvrt());
         System.out.println("Кому не достались квартиры " + svobodny(human, gelaushih, luserArray,citizens) );
         Vmestimost(citizens);


    }



}


class Human{
    String fio;
    int etage;
    int keysOfKvart;


     Human (String fio, int etage) {
         this.fio=fio;
         this.etage=etage;
     }
}