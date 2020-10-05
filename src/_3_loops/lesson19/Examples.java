package _3_loops.lesson19;

public class Examples {
    public static void main(String[] args) {
        //example 1
        int i = 0;
        for (int j = 0 ; i < 5; i++){
            System.out.println(i + j);
        }
        //System.out.println(i + j);
        int j = 0;
        //int i = 0;

        //example 2
        int k = 0;
        for (k = k + 2; k < 5; k++) {
        }

        //example 3
        for(i++, j++; i+j < 5 ; i++){
        }

        //example 4
        //for(int i1 = 0, int j1 = 0; i1+j1 < 5; i1++ ){ //compile error
        //}

    }
}
