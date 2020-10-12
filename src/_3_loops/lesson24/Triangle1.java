package _3_loops.lesson24;

public class Triangle1 {
    public static void main(String[] args) {
        int rowNumber = 9;
        for (int rows = 0; rows < rowNumber; rows++) {
            for (int spaces = 0; spaces < rows; spaces++){
                System.out.print(" ");
            }
            for (int symbols = rowNumber-rows; symbols > 0; symbols--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
