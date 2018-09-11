/*
Урок 9.
Выведение простых точечных треугольников с помощью вложенного for
 */
package triangles_9;

public class Handler {
    public static void main(String[] args) {
        int rows = 7;
        //first triangle
        for (int j = 1; j<=rows; j++){
            for (int i = 1; i<=j; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second triangle
		for(int i = rows; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.print("o");
			}
			System.out.println();
		}
    }
}

/* HOMEWORK TEST

1. Що буде виведено в результаті виконання коду?
class Handler{
            public static void main(String[ ] args){
                    for(int i = 0; i < 2; i++){
                            int j = ++i;
                            while(j < 3){
                                    System.out.println(++i + j++);
                            }
                    }
            }
    }

1
2
3
4
5
6

 */