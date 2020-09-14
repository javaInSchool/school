/*
Урок 8.
Выведение матриц. Вложенный for
 */

package loops_inner_for_8;

public class Handler {
    public static void main(String[] args) {
        for (int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                System.out.println(++i + j++);
            }
        }

        // matrix from 1 and 0
        for (int m=1; m<=4; m++){
            for (int n=1; n<=4; n++){
                if(m==n){
                    System.out.print("1\t");
                }else{
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}

/* HOMEWORK TEST

 Що буде виведено в результаті виконання коду?
class Handler{
            public static void main(String[ ] args){
                    for(int i = 0; i < 2; i++){
                            for(int j = 0; j < 3; j++){
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
Нічого не буде виведено

 */