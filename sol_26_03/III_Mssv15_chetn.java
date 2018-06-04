package sol_26_03;

public class III_Mssv15_chetn {
    // 3) Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    // Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
    // выведете это количество на экран на отдельной строке.

    public static void main(String[] args) {
      int[] arr1 = new int[15];
      int cnt=0;

        for (int i = 0; i < 15; i++){
            int b = (int)(Math.random()*9);
            arr1[i]=b;
            System.out.print(arr1[i]);
                if (b%2==0&&b!=0) cnt++;
        }

        System.out.println(" " );
        System.out.println("кол-во четных чисел в массиве= "+cnt);


    }
}