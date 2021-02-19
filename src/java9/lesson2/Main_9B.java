import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	public static void main(String[] args) throws FileNotFoundException {
	    Scanner in = new Scanner( new File("input.txt") );
	    String data = in.nextLine();
		System.out.println(data);
		
		System.out.println( data.length() );  // вывести количество символов
		System.out.println( data.charAt(200) ); //вывести символ на 200 месте (с индексом 200)
		System.out.println( data.indexOf('w') ); //возвращает индекс первого появления символа
		
		System.out.println( data.indexOf('w', 51) ); //возвращает индекс первого появления символа c 51 индекса
		
		System.out.println( data.indexOf("Mars") ); // возвращает индекс первой буквы первого совпадения с cтрокой "Mars"
		
		String word = data.substring(10, 20); // вырезать подстроку с 10 по 20 индекс, счет в строках начинается с 0
		System.out.println( word );
		
		String searchWord = "arrival";
		int index = data.indexOf(searchWord);       //возвращает индекс первого появления слова "arrival"
		int searchWordLength = searchWord.length(); // возвращает количество символов в слове "arrival"
		
		String cutWord = data.substring(index, index+searchWordLength);   // вырезать подстроку с index по index+searchWordLength  = 
		System.out.println(cutWord);                                        // вывести в консоль то, что вырезали из data, т.е. "arrival"
		
		for(int i = 0; i < cutWord.length(); i++){              // for - оператор повтора, поторяется команда в  { } скобках
		    System.out.println( cutWord.charAt(i) );
		}
		
		/*  comment
		dfgdfg
		fgdfg
		ddatagd
		fgdfgfg
		dfgdfgdfg  comment */
	}
}
