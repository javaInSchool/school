/*
Урок 7.
Циклы for и while для определения суммы целых чисел
 */

package loops_while_7;

public class Handler {
    public static void main(String[] args) throws InterruptedException {
        int x = 7;
		int sum = 0;

		while(sum<1000){
			sum = sum + x;
			System.out.println(sum);
			Thread.sleep(100);
		}
		System.out.println("Цикл окончен. Вышли из цикла.");
    }
}

/* HOMEWORK TEST

1. Що буде виведено в результаті виконання коду?
class Handler{
            public static void main(String[ ] args){
                    int a = 2;
                    int b = 4;
                    while(a++ < --b){
                            System.out.println(a + b);
                    }
             }
    }

5
6
7
Нічого не буде виведено
Буде сформовано помилку компіляції

 */