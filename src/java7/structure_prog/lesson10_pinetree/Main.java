package lesson10;

public class Main {
    public static void main(String[] args) {
        // i - строки, k - звезды, j - пробелы
        int h = 3; // h- высота треугольника или кол-во строк
        int triangleNumber = 3;
        for (int t = 1; t <= triangleNumber; t++) { //повторение треугольника
            for (int i = 1; i <= h; i++) { //повторение строки в треугольнике
                for (int j = (h - 1)+(triangleNumber-t); j >= i; j--) {//повторение " " в строке
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {//повторение "*" в строке
                    System.out.print("*");
                }
                System.out.println();
            }
            h++; // увеличить размер треугольника
        }
    }
}
