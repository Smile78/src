package sol_26_03_Mssv;

public class IV_Mssv2_po5 {
    // 4) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
    // выведите массивы на экран в двух отдельных строках.
    // Посчитайте среднее арифметическое элементов каждого массива
    // и сообщите, для какого из массивов это значение оказалось больше
    // (либо сообщите, что их средние арифметические равны).

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int cnt=0;
        int sr1=0;
        int sr2=0;

        for (int i = 0; i <5; i++){
            arr1[i]= (int)(Math.random()*5);
            arr2[i]= (int)(Math.random()*5);
        }

        for (int i = 0; i < 5; i++){
          System.out.print(arr1[i]);
          sr1=sr1+arr1[i];
        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++){
          System.out.print(arr2[i]);
            sr2=sr2+arr2[i];}

//            кто там кроме нас с вами знает, что оно среднее
        System.out.println(" ");
        if (sr1>sr2) System.out.println("среднее  арифм. первого массива выше второго");
        else if(sr1==sr2)System.out.println("среднее  арифм.  массивов равны") ;
        else if(sr1<sr2)  System.out.println("среднее  арифм. первого массива ниже второго");


    }
}