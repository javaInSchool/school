package _9_exceptions.lesson107;

public class Solution2 {
    public static void main(String[] args) {
        processException(new Solution2());
    }
    public static void processException(Solution2 o){
        try {
            o.method1();
        }catch (NullPointerException npe){
            printStack(npe);
        }
    }
    public static void printStack(Throwable t){
        System.out.println(t);
        System.out.println(t.toString());
    }
    public void method1()throws NullPointerException{
        throw new NullPointerException();
    }
}
