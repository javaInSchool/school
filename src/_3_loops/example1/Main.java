package _3_loops.example1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println((i < 5) + " " + i);
        }

        for (int i = 5; i > 0; i--){
            System.out.println((i > 0) + " " + i);
        }

        int i = 0;
//        for (int i = 0; i < 5; i++){
//            System.out.println((i < 5) + " " + i);
//        }
//
//        int i = 0;
//        for (i = 3; i < 5; i++){
//            System.out.println((i < 5) + " " + i);
//        }

        for (int k = 0, a = 2; a + k < 5; k++, a= a+1){
            System.out.println((k < 5) + " " + k);
        }

        //for (int k = 0, int a = 2; a + k < 5; k++, a= a+1){
        //    System.out.println((k < 5) + " " + k);
        //}
    }
}
