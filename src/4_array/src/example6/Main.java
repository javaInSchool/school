package example6;

public class Main {
    public static void main(String[] args) {
        int[] x= {3, 2, 7, -5, 9, -3, -8 , 1};

        int countNeg = 0;
        for (int temp: x) {
            if (temp<0) countNeg++;
        }
        //создали массивы
        int[] pos = new int[x.length-countNeg];  // length = 5
        int[] neg = new int[countNeg];                // length = 3
        // заполнение массивов
        int p = 0;
        int n = 0;
        for (int i=0; i < x.length; i++) {
            if (x[i]<0) {
                neg[n++] = x[i]; //постфиксная форма инкремента элегантно позволяет преобразовать программу. Сначала элемент массива х записывается в n-й элемент массива neg, потом n увеличивается на 1. Сначала используется как основное значение, затем увеличивается на 1.
                //n++;
            } else {
                pos[p++] = x[i];
                //p++;
            }
        }
        // output
        for (int i=0; i < pos.length; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
        for (int temp: neg) {
            System.out.print(temp + " ");
        }
    }
}
