package sol_23_03_Posl_Sort;

import java.math.BigInteger;

public class ccl_4_natur_prost {
//4) Проверьте,  является ли  натуральное число — простым.


    public static void main(String[] args) {

        int x = 3; // натур >0

        Integer integer = x;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));

        System.out.println(probablePrime);

    }
}