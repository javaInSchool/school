package lesson2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(new File("src/lesson2/input.txt"));
        String data = in.nextLine(); //прочитать 1 строку из файла
        System.out.println(data);
        // количество символов в строке
        System.out.println( data.length() );
        // символ на 10 позиции, считает с 0
        System.out.println( data.charAt(10));
        // возвращает номер первого появления буквы s в строке
        System.out.println( data.indexOf('s'));
        // возвращает номер первого появления буквы s в строке начиная с 18 символа
        System.out.println( data.indexOf('s',18));
        // возвращает номер первого появления строки "is" в строке
        System.out.println( data.indexOf("is"));
        //ПРИМЕР. Найти в тексте слово computer
        //найдем первую букву 'c'
        System.out.println( data.indexOf('c'));
        //вырезаем слово с 22 по 30 символ и сохраняем в переменную word
        String word = data.substring(22,30);
        System.out.println( word );
        //выводим каждый символ из строки word отдельно через " "
        for (int i = 0, n = word.length(); i < n; i++){
            System.out.print( word.charAt(i) + " ");
        }
    }
}
