package triangle;
public class Main {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = rows-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}