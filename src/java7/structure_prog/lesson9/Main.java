package lesson9;

public class Main {
    public static void main(String[] args) {
        for(int lines = 1; lines <= 3; lines++){
            for(int space = 3; space-lines > 0; space--){
                System.out.print(" ");
            }
            for (int star = 0; star < lines; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lines = 1, 1 <= 3  - true
        // space = 3, 3-1 > 0 - true
        // " "
        // space--  -> space = 2
        // 2 - 1 > 0 - true
        // " "
        // space--  -> space = 1
        // 1 - 1 > 0 - false
        // star = 0
        // 0 < 1 - true
        // "*"
        // star ++   -> star = 1
        // 1 < 1 - false
        //
        // lines++ -> lines = 2
    }
}
