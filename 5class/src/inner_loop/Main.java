package inner_loop;

public class Main {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 0; i < rows; i++) { //перебор строк
            for (int j = 0; j < i+1; j++) { //перебор звезд в строке
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    строки = 7
    i = 0
    0 < 7, true
    j = 0
    0 < 0 + 1, true
    печатаем *
    j = 1
    1 < 0 + 1, false
    переход на новую строку
    i = 1
    1 < 7, true

     */
    /*
    i=0, j<0 + 1 *
    i=1, j<1 + 1 **
    i=2, j<2 + 1 ***
    i=3, j<3 + 1 ****
     */
}
