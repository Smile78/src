package tresh.sol_23_03;


public class ccl_6_tram_v1_1 {
    //6) В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает
    // в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого
    // сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
    //  Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
    //  как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

    public static int[] fill(int[] tkts){
        for (int i=0; i<999999;i++){
            tkts[i]=i+1;
        }
        return tkts;
    }



    private static String[] dlMsvStr2(int[] tkts, String[] strTkts4,int sch31,int sch32, String nul1) {

        for (int i = sch32; i < sch31; i++) {
            String str1 = Integer.toString(tkts[i]);
            String str00 = (nul1);
            strTkts4[i-sch32] =  str00.concat(str1);
        }
        return strTkts4;
    }




    public static void printMsv2(String[] strTkts4,int sch2) {
        int k=0;
        for (int i = 0; i <sch2; i++) {
            k=k+1;
        }
        System.out.println("кол-во в стринг массв: "+k);
    }



    private static void spltSumStr2(String[] strTkts4,int sch) {
        int win=0;
        for (int i = 0; i <sch; i++) {

//            System.out.println(strTkts4[i]);// THATS OK

            String plv1= strTkts4[i].substring(0,3);
            String plv2= strTkts4[i].substring(3,6);

//            System.out.println(plv1);// // THATS OK
//            System.out.println(plv2);// // THATS OK

            int chslPlv1 = Integer.parseInt(plv1);

            int cif1_1=chslPlv1%10;             //   789/10 =               9
            int ch1_2=Math.round(chslPlv1/10);  //   789/10 =78,9     78
            int cif1_2=ch1_2%10;                   //    78%10    =            8
            int cif1_3=Math.round(ch1_2/10);       //    78/10 =7,8            7

            int sum1 = cif1_1+cif1_2+cif1_3;

            int chslPlv2 = Integer.parseInt(plv2);

//            System.out.println(chslPlv1);// // THATS OK

            int cif1=chslPlv2%10;             //   789/10 =               9
            int ch2=Math.round(chslPlv2/10);  //   789/10 =78,9     78
            int cif2=ch2%10;                   //    78%10    =            8
            int cif3=Math.round(ch2/10);       //    78/10 =7,8            7

            int sum2 = cif1+cif2+cif3;

            if (sum1==sum2) {
//                System.out.println("We got winner: "+plv1+plv2);
                win++;
            }
        }
        System.out.println("медалей по оч.разр "+win);
    }

    public static void main(String[] args) {
        //000000 проебан

        int[] tkts  = new int[999999];
        String[] strTkts   = new String  [8999];// 4х разрядный  минус тыща
        String[] strTkts2  = new String [89999]; //5 ти разрядный  минус 10000 из пред. и еще пока не 6 разряд
        String[] strTkts3  = new String[899999]; //6 ти разрядный  минус 100000 из пред.

        fill(tkts); // заполнение массива от 1 до 999999

        dlMsvStr2(tkts,strTkts,9999,1000,"00"); // создаем строчный массив билетиков на шесть разрядов из
        // только !!! ******** из 4х разрядных цифр **********
        // (преобразуем из числового с добавлением где надо нулей)

        dlMsvStr2(tkts,strTkts2,99999,10000,"0"); // создаем строчный массив билетиков на шесть разрядов из
        // только !!! *******  из 5х разрядных цифр **********

        dlMsvStr2(tkts,strTkts3,999999,100000,""); // создаем строчный массив билетиков
        // только !!! *******  из 6 разрядных цифр **********



        printMsv2(strTkts,8999);// печать заполненного строчного массива
        // только !!! из 4х разрядных цифр

        spltSumStr2(strTkts,8999); //суммы и тд на 4 разр



        printMsv2(strTkts2,89999);// печать заполненного строчного массива
        // только !!! из 5 х разрядных цифр

        spltSumStr2(strTkts2,89999);//суммы и тд на 5 разр


         printMsv2(strTkts3,899999);// печать заполненного строчного массива
        // только !!! из 6 х разрядных цифр

        spltSumStr2(strTkts3,899999);//суммы и тд на 6 разр





    }



}
