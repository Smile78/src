package sol_26_03_Mssv;

import java.util.Scanner;

public class xString_II_retry_XXX {

    // 2) Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef".

    public static String input( ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Наберите пожалуйста, немного текста, будьте так добры. Спасибо");
        String  i = sc.nextLine();

        return i;
    }

    public static void main(String[] args) {

        String str1 = input();
        String str4  ;
//        String str2="";
//        int b= str1.length();

        char[] arr1= str1.toCharArray();

        for (int i=0;i<arr1.length;i++){
        if(i>0){
            for (int t=0;t<i;t++){
                if (arr1[i]==arr1[t]){
                arr1[i]=0;
            }}}}


        StringBuilder st2 = new StringBuilder(arr1.length);
        StringBuilder st3 = new StringBuilder(arr1.length);

        for (char ch2 : arr1) {
            if ( ch2 != 0 ) {
                st2.append(ch2);
            }
        }

//
//        for (char ech:arr1){
//            str2 =str2.concat(String.valueOf(ech));
//        }
//


        str4 = st2.toString().replaceAll("\\s","");
        System.out.println(str4);

    }
}
