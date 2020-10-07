package _3_loops.lesson23;

public class InnerLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println(i);
        }

        //#
        //##
        //###
        for (int i = 1; i < 8; i++) { //rows
            for (int j = 0; j < i ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}