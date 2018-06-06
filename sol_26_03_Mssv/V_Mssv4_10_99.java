package sol_26_03;

public class V_Mssv4_10_99 {
    //  5) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
    // Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

    public static void main(String[] args) {

        int[] arr1 = new int [4] ;
         int sum1=0;

        for (int i = 0; i <4; i++){
            arr1[i]= (int)((Math.random()*89)+10);
            System.out.print(arr1[i]+" ");
        }

        for (int i = 0; i <3 ; i++){
            if (arr1[i+1]>arr1[i])
                sum1++;
        }

        if (sum1>2)System.out.print("вот вам и рандомайз");
        else  System.out.print("но не было");
     }
}