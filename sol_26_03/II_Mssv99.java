public class II_Mssv99 {
    //    2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
    public static void main(String[] args) {

        int arr1[] = new int[100];

        for (int i = 1;i < 100; i++) {
            arr1[i] = i;
//
             System.out.print(" arr1 :" + arr1[i]);
        }
             System.out.println("  ");
             System.out.println("  ");

        for (int i = 99;i > 0; i--){
             System.out.print(" arr1 :" + arr1[i]);
        }
    }
}