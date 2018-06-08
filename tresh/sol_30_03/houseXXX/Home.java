package tresh.sol_30_03.houseXXX;

public class Home {


    static int paradn;
    static int etage;
    static int kvartNaEtag;
    static String adress ;
    
    static int kvrtrVsego;
    static int citzns;


    

 Home(int paradn, int etage, int kvartNaEtag, String adress) {
     this.paradn = paradn;
     this.etage = etage;
     this.kvartNaEtag = kvartNaEtag;
     this.adress = adress;
 }


    public static int  skkKv (){
//          System.out.println("всего квартир :"+paradn*etage*kvartNaEtag);
          return paradn*etage*kvartNaEtag;
    }

    public static void showAdr (){
         System.out.println("адрес: "+adress);
     }

    public static int showCtzn (){
        return citzns;
      }

      
        public static void  add(Human human){
         citzns++;
        }

    public static void main(String[] args) {
        Home home = new Home(4,9,4,"Komendantsky prospect 40"); //построили дом
        Human[] humans = new Human[150];    // объявляем кол-во человек
        Kvartiri[] kvrtRs = new Kvartiri[145];  //создаем квартиры

        kvrtrVsego=skkKv();
        System.out.println("квартир всего: "+kvrtrVsego);//просто печать общ кол-ва квартир
        showAdr(); // просто печать адреса
        System.out.println("дольщики и тп: "+ showCtzn()); // просто общ колво желающих

          //        создаем типо 150 человеков  -фио-этажность-ид
        for (int i=0;i<150;i++){
            String str1="петр";
            String str2=str1.concat(Integer.toString(i+1));
            humans[i]=new Human(i,str2,((int)(Math.random()*9)+1));// айди фио этажнсть
            humans[i].zaselen=0; //заселенЛи
        }




        int cnt=1;
        for (int i=1;i<5;i++){//пдъзд
            for (int j=1;j<10;j++){//этж
                for (int x=1;x<5;x++) { // кв на 1 этж

//                    System.out.println("квртра "+cnt+" этаж "+j+"парадная "+i );
                    kvrtRs[cnt] = new Kvartiri(cnt, j, i); //сразу и номер и этаж и парадная
                    kvrtRs[cnt].chckVacnt = 0;
                    cnt++;
//                    kvrtRs[cnt].iDchelvk = -1; //  -нельзя на халяву, потому как 0 это первый житель
                }}}


//        lottery 3 balls for 1st 3id   humans
        for (int j=0;j<45;j++) {
            if (humans[j].zaselen==0){
                for (int i = 1; i < 145; i++) {
                    if (kvrtRs[i].chckVacnt==0&&kvrtRs[i].nmbrEtage==humans[j].etagnost) {
                            kvrtRs[i].iDchelvk = j+1;
                            kvrtRs[i].chckVacnt = 1;
                            humans[j].nmbrKvartiri = i;
                            humans[j].zaselen = 1;
                    }
                }
            }
        }

        System.out.println("фио 1 го жльца "+ humans[0].fio);
        System.out.println("фио 1 го жльца 1ой квартиры "+ humans[kvrtRs[1].iDchelvk-1].fio);



//        for (int i=1;i<145;i++){//пдъзд
//            System.out.println("в пардке нмр:"+ kvrtRs[i].nmbrParadn+ " на этж: "+kvrtRs[i].nmbrEtage+ " нмр квтры : "
//                    +kvrtRs[i].nmbrKvrtr+" и соотвствнно квртр зант/пуста"+kvrtRs[i].chckVacnt+" живет чел номер: "+kvrtRs[i].iDchelvk+"  "
//                        );
//        }

        System.out.println("в пардке нмр:"+ kvrtRs[1].nmbrParadn+ " на этж: "+kvrtRs[1].nmbrEtage+ " нмр квтры : "
                    +kvrtRs[1].nmbrKvrtr+" и соотвствнно квртр зант/пуста"+kvrtRs[1].chckVacnt+" живет чел номер: "+kvrtRs[1].iDchelvk+"  "
                        );

        System.out.println("в пардке нмр:"+ kvrtRs[2].nmbrParadn+ " на этж: "+kvrtRs[2].nmbrEtage+ " нмр квтры : "
                    +kvrtRs[2].nmbrKvrtr+" и соотвствнно квртр зант/пуста"+kvrtRs[2].chckVacnt+" живет чел номер: "+kvrtRs[2].iDchelvk+"  "
                        );

        System.out.println("   фио "+humans[0].fio+" предпочтение этажа"+humans[0].etagnost+" номер квартиры "+humans[0].nmbrKvartiri  );
        System.out.println("   фио "+humans[1].fio+" предпочтение этажа"+humans[1].etagnost+" номер квартиры "+humans[1].nmbrKvartiri   );
        System.out.println("   фио "+humans[2].fio+" предпочтение этажа"+humans[2].etagnost+" номер квартиры "+humans[2].nmbrKvartiri  );
        System.out.println("   фио "+humans[3].fio+" предпочтение этажа"+humans[3].etagnost+" номер квартиры "+humans[3].nmbrKvartiri  );



    }
}







