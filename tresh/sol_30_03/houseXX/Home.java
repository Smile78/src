package tresh.sol_30_03.houseXX;

public class Home {

    static int podezd;
    static int etage;
    static int kvartNaEtag;
    static String adress;

    static int cntZhelnaEtag1=0;
    static int cnt2 =0;
    static int cntZhelnaEtag5=0;

    static int nomerKvartiri;


    Home(int podezd, int etage, int kvartNaEtag, String adress  ) {
        this.podezd=podezd;
        this.etage=etage;
        this.kvartNaEtag=kvartNaEtag;
        this.adress=adress;

    }

    public int skokaKvrt() {
        return podezd*etage*kvartNaEtag;
    }

    public void showAdress() {
        System.out.println("адрес: "+adress);
    }

    public void Vmestimost() {
        System.out.println("Всего квартир  "+ kvartNaEtag*podezd*etage);
    }



     public static void main (String [] args) {

         Home home = new Home(2,9,2,"Komedantsky pr. 40");

         Human[] arrHuman = new Human[7];

         arrHuman[0] = new Human ("NAS",5);
         arrHuman[1] = new Human ("ZOO",5);
         arrHuman[2] = new Human ("NSS",5);
         arrHuman[3] = new Human ("NNN",5);
         arrHuman[4] = new Human ("BAI",5);
         arrHuman[5] = new Human ("BAI",1);
         arrHuman[6] = new Human ("BAI",1);

         cntWants(arrHuman);



     }



    private static void cntWants(Human[] human) {
        for(int i=0;i<human.length;i++){
            if (human[i].etage==1)  cntZhelnaEtag1++;
            if (human[i].etage==5)  cntZhelnaEtag5++;
            }

        System.out.println(" на каждом этаже во всех парадных всего квартир по"+kvartNaEtag*podezd +" штук");
        System.out.println(" желающих на 1ый "+cntZhelnaEtag1 );
        System.out.println(" желающих на 5ый "+cntZhelnaEtag5 );

        if (cntZhelnaEtag5>kvartNaEtag*podezd) {
            System.out.println("на 5ом недостанется"+ (cntZhelnaEtag5-kvartNaEtag*podezd));
        }
    }




    }




class Human{
    String fio;
    int etage;


     Human (String fio, int etage) {
         this.fio=fio;
         this.etage=etage;
     }
}