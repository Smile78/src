package sol_26_03_Mssv;

public class VII_Mssv_5Strings {
    // 7) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
    // Вывести массив на экран.
        // После на отдельной строке вывести на экран значение максимального элемента этого массива
    // (его индекс не имеет значения).

    public static void main(String[] args) {
         int[][] arr1 = new  int[5][8];
         int[] arr2 = new  int[40];
         int cnt=0;
         int grande=-99;

         for (int i=0;i<5;i++){
            for (int j=0;j<8;j++){
                 arr1[i][j]= (int)(Math.random()*199-99);
                    if(arr1[i][j]>grande){
                            grande = arr1[i][j];
                            cnt++;
                    }
            }
         }

         for (int i=0;i<5;i++){
            for (int j=0;j<8;j++){
                 System.out.println("arr1[i][j]"+ arr1[i][j]);
            }
         }

            System.out.println(" grande "+grande);
    }
}