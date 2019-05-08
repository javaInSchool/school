package exception_example_deep;

public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN main");
        m1();
        System.out.println("END main");
    }
    public static void m1(){
        System.out.println("BEGIN m1");
        m2();
        System.out.println("END m1");
    }
    public static void m2(){
        System.out.println("BEGIN m2");
        try {
            m3();
        }catch (RuntimeException e){
            System.out.println("Exception type: " + e);
        }
        System.out.println("END m2");
    }
    public static void m3() throws ArithmeticException{
        int x = 8;
        int y = 0;
        System.out.println("BEGIN m3");
        //try {
            System.out.println(x / y);
        //}catch (RuntimeException e){
        //    System.out.println("Exception type: " + e);
        //}
        System.out.println("END m3");
    }
}
