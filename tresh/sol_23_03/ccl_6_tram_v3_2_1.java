package tresh.sol_23_03;
import java.util.Scanner;

public class ccl_6_tram_v3_2_1 {
    //6) В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает
    // в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого
    // сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
    //  Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
    //  как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

        //999999 -000000 -001001-001010


    //******* 6 разр ОНЛИ *******

    public static int[] razrv3(int chis6){
        int cif6 = chis6 % 10;  //6
        int chis5 = Math.round(chis6 / 10);  //12345
        return new int[] {cif6,chis5};
    }

    public static void main(String[] args) {

        int chis6 ;

        Scanner inpKlv = new Scanner(System.in);
        System.out.print("Введите билетик: ");
        chis6=inpKlv.nextInt();

        String str1 = Integer.toString(chis6);

        if (str1.length()>5) {

            int[] chis6X = razrv3(chis6);
            int cif6 =  chis6X[0];
            int chis5 = chis6X[1];

            int[] chis5X = razrv3(chis6X[1]);
            int cif5 = chis5X[0];
            int chis4 =chis5X[1];

            int[] chis4X = razrv3(chis5X[1]);
            int cif4 = chis4X[0];
            int chis3 = chis4X[1];

            int[] chis3X = razrv3(chis4X[1]);
            int cif3 = chis3X[0];
            int chis2 = chis3X[1];

            int[] chis2X = razrv3(chis4X[1]);
            int cif2 = chis2X[0] ;

            int cif1 = chis3X[1];



//            System.out.println(cif6+" " + cif5 +" "+ cif4);
//            System.out.println(cif3+" " + cif2 +" "+ cif1);
//
//            System.out.println(chis6+" " + chis5 +" "+ chis4);
//            System.out.println(chis3+" " + chis2  );

            int sum1 = cif6 + cif5 + cif4;
            int sum2 = cif3 + cif2 + cif1;

            if (sum1 == sum2) {
                System.out.println("We got winner: " + chis6);
            } else System.out.println("dont be so shy ");
        }

    }
}
