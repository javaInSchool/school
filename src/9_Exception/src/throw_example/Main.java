package throw_example;

public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN main");
        try {
            divide(6, 0);
        }catch (ArithmeticException e){
            System.out.println("Additional processing");
        }
        System.out.println("END main");
    }
    static void divide(int a, int b) {
        System.out.println("BEGIN divide");
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e); //partly processing
            throw e;   //exception to method main
        } finally {
            System.out.println("finally divide");
        }
        System.out.println("END divide");
    }
}
