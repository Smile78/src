package sol_23_03;


public class ccl_4_natur_prost_v2 {
    //4) Проверьте,  является ли  натуральное число — простым.

    public static void main(String[] args) {

        int x =1; // натур >0
        int i = (int) Math.sqrt(x);
        System.out.println(" iо :" + i);
        if (x ==1) System.out.println("не просто :" + x);
        else{
        if (x == 3||x==2) System.out.println("просто :" + x);
        else{
            for (int j = 2; j <= i; j++) {
                if (x % i == 0) {
                    System.out.println("не просто :" + x);
                } else System.out.println("просто :" + x);
            }
        }}}
    }
