package _3_loops.lesson23;

public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        for (   ; i<10; i++) ;      // (1)
        for (i=0;     ; i++) break; // (2)
        for (i=0; i<10;    ) i++;   // (3)
        for (   ;     ;    ) ;      // (4)
    }
}
