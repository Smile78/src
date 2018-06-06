package sol_26_03;

import java.util.Scanner;

public class xString_I_shift {

// 1) Найти в строке указанную подстроку и заменить ее на новую.
// Строку, ее подстроку для замены и новую подстроку вводит пользователь.
public static String input(int b) {

        Scanner sc = new Scanner(System.in);
        if (b==1){
        System.out.println("Наберите пожалуйста, немного текста, будьте так добры. Спасибо");
        }
        if (b==2){
            System.out.println("Наберите пожалуйста, малую часть предудущего текста, будьте так добры. Спасибо");
        }
        if (b==3){
            System.out.println("Наберите пожалуйста, новый текст, на замену  вышеуказанной части, будьте так добры. Спасибо");
        }
        String  i = sc.nextLine();

    return i;
}

    public static void main(String[] args) {

        String str1 = input(1);
        String str2 = input(2);
        String str3 = input(3);

          System.out.println( str1.replace(str2, str3));

    }
}
