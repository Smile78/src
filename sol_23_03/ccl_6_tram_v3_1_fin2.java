package sol_23_03;
import java.util.Scanner;

public class ccl_6_tram_v3_1_fin2 {
    //6) В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает
    // в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого
    // сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
    //  Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
    //  как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

        //999999 -000000 -001001-001010
        //6 разр ОНЛИ

    public static int[] fill(int[] tkts){
        for (int i=0; i<999999;i++){
            tkts[i]=i+1;
        }
        return tkts;
    }

    public static void main(String[] args) {
        int cnt=0;
        int chis6 ;

        int cif6,cif5,cif4,cif3,cif2,cif1;
        int chis5,chis4,chis3,chis2;
        int sum1,sum2;

//        Scanner inpKlv = new Scanner(System.in);
//        System.out.print("Введите билетик: ");
//        chis6=inpKlv.nextInt();

        int[] tkts  = new int[1000000];
        fill(tkts);
//                System.out.print(tkts[10009]);

        for (int i:tkts) {
        chis6=tkts[i];


        String str1 = Integer.toString(chis6);

        if (7>str1.length()&&str1.length()>5) {

              cif6 = chis6 % 10;  //6
              chis5 = Math.round(chis6 / 10);  //12345
              str1 = Integer.toString(chis5);

          if (6>str1.length()&&str1.length()>4) {
              cif5 = chis5 % 10;   // 5
              chis4 = Math.round(chis5 / 10);  //1234
              str1 = Integer.toString(chis4);

           if (5>str1.length()&&str1.length()>3) {
              cif4 = chis4 % 10;   // 4
              chis3 = Math.round(chis4 / 10);  //123
               str1 = Integer.toString(chis3);

               if (4>str1.length()&&str1.length()>2) {
                   cif3 = chis3 % 10;   // 3
                   chis2 = Math.round(chis3 / 10);  //12
                   str1 = Integer.toString(chis2);

                  if (3>str1.length()&&str1.length()>1) {
                      cif2 = chis2 % 10;   // 2
                      cif1 = Math.round(chis2 / 10);  //1

                      sum1 = cif6 + cif5 + cif4;
                      sum2 = cif3 + cif2 + cif1;

                      if (sum1 == sum2) {
                          cnt++;
//                          System.out.println("We got winner: " + chis6);
                      }
//                      else System.out.println("dont be so shy ");

                  }}}}

        }

    }
        System.out.println("Медалек: "+cnt);
    }
}
