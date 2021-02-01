package java7.structure_prog.lesson8_inner_loops;

public class Main {
    public static void main(String[] args) {
        // вложенные операторы повтора
        for (int i = 1; i <= 5; i++){       //внешний цикл
            System.out.print(i + ": ");     //вывод на екран "номер строки"
            for (int k = 3; k <= 6; k++){   //внутренний цикл
                System.out.print(k + " ");  //вывод на екран чисел от 3 до 6
            }
            System.out.println();           //переход на новую строку
        }
    }
}
