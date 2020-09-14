/*
Урок 5.
Операции инкремента и декремента.
Префиксная и  постфиксная форми
 */

package inc_dec_5;

public class Handler {
    public static void main(String[] args) {
        int x = 6;
        x = x + 2;
        System.out.println(x);
        x+=2;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
    }
}

/* HOMEWORK TEST

1. Що буде виведено в результаті виконання коду?
int x = 11;
    int y = 15;
    int z = 19;
    int a = ++x + y++ + z--;
    System.out.println(a);

44
45
46
47
Буде сформовано помилку компіляції

 */