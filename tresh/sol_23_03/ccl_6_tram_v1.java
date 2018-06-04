package tresh.sol_23_03;
//только для 4 разрядных

public class ccl_6_tram_v1 {
    //6) В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает
    // в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого
    // сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
    //  Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
    //  как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

    public static int[] fill(int[] tkts){
        for (int i=0; i<9999;i++){
            tkts[i]=i+1;
        }
        return tkts;
    }

    public static void printMsv(int[] tkts) {
        for (int i = 0; i <9999; i++) {
            System.out.println(tkts[i]);
        }
    }

    private static String[] dlMsvStr(int[] tkts, String[] strTkts) {
        for (int i = 1000; i < 9999; i++) {
            String str1 = Integer.toString(tkts[i]);
            String str00 = ("00");
              strTkts[i-1000] =  str00.concat(str1);
        }
        return strTkts;
    }

    public static void printMsv(String[] strTkts) {
        int k=0;
        for (int i = 0; i <8999; i++) {
             k=k+1;
        }
        System.out.println("strTkts[0]    :" + strTkts[0]);
        System.out.println("strTkts[8999] :" + strTkts[8998]);
        System.out.println("кол-во в стринг массв: "+k);
    }

    private static void spltSumStr(String[] strTkts) {
        int win=0;
        for (int i = 0; i <8999; i++) {

            String plv1= strTkts[i].substring(0,3);
            String plv2= strTkts[i].substring(3,6);

            int chslPlv1 = Integer.parseInt(plv1);
            int chslPlv2 = Integer.parseInt(plv2);

            int cif1=chslPlv2%10;             //   789/10 =               9
            int ch2=Math.round(chslPlv2/10);  //   789/10 =78,9     78
            int cif2=ch2%10;                   //    78%10    =            8
            int cif3=Math.round(ch2/10);       //    78/10 =7,8            7

            int sum = cif1+cif2+cif3;

            if (chslPlv1==sum) {
                System.out.println("We got winner: "+plv1+plv2);
                win++;
            }
        }
        System.out.println("медалей "+win);

    }


    public static void main(String[] args) {
        int[] tkts  = new int[999999];
        String[] strTkts  = new String[999999];

        fill(tkts); // заполнение массива от 1 до 9999
//        printMsv(tkts);// печать заполненного массива

        dlMsvStr(tkts,strTkts); // создаем строчный массив билетиков на шесть разрядов из
        // только !!! из 4х разрядных цифр
        // (преобразуем из числового с добавлением где надо нулей)

        printMsv(strTkts);// печать заполненного строчного массива
        // только !!! из 4х разрядных цифр

        spltSumStr(strTkts);



    }



}
