package loops;

public class Main {
    public static void main(String[] args) {
        int price = 25;
        for ( int i = 1; i<=10; i++ ){
            System.out.println(i + " шоколадка стоит "
                    + i*price + " гривен");
        }
    }
}
