package java7.codewars;

public class Test {

    //public Test INST = new Test();

    private static int ONE_HUNDRED = 100;

    private int value;

    Test() {
        System.out.println(ONE_HUNDRED);
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(new Test().plus100(23));
    }


}
