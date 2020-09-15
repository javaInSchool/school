package try_catch;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try{
            System.out.println(x/y);
        }catch(ArithmeticException ae){
            System.out.println("Не делите на 0");
        }
        System.out.println("Продолжение программы");
    }
}
