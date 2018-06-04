package sol_13_04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class CollTest {



        public static void main(String[] args) throws IOException {

        File txt = new File("src/sol_13_04/wp.txt");

        List<String> lines = Files.readAllLines(txt.toPath());  //прочитать данные из файла как последовательность строк
        System.out.println(lines);

        List<String> wordsLst = new ArrayList<>();

            for (String str1: lines){

            }

            System.out.println(wordsLst );

            System.out.println(wordsLst.size());




        }}
