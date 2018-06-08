package sol_26_03_Mssv;

import java.util.Arrays;
import java.util.Scanner;

public class xString_III_symb_XXX {


//3) Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
// Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
// Например, если дана строка "дом 48, корпус 9, парадная 7, этаж 4", то в массиве должны оказаться числа 48, 9, 7 и 4


    public static String input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Наберите пожалуйста, буквы, целые неотрицательные числа и иные символы. Спасибо");
        String i = sc.nextLine();

        return i;
    }

    public static void main(String[] args) {

        String str1 = input();

        int i3 = 0;
        StringBuilder sb3 = new StringBuilder();//числа
        StringBuilder sbStr = new StringBuilder();//строка чисел


        while (i3 < str1.length()) {
            if (Character.isDigit(str1.charAt(i3))) {
                while (Character.isDigit(str1.charAt(i3))) {
                    sb3.append(str1.charAt(i3));
                    i3++;
                        if (i3 == str1.length()) {
                            break;
                        }
                }


                int k = Integer.parseInt(sb3.toString());
                sbStr.append(k + " ");
                sb3.delete(0, sb3.length());
            } else {
                i3++;
            }
        }

        int[] arr3 = Arrays.stream(sbStr.toString().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.print(Arrays.toString(arr3));
    }
}
