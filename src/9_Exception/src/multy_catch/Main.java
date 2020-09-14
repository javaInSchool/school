package multy_catch;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 0;
        double[] array = {1.2, 6.9, 9.2, -0.1};
        System.out.println("BEGIN");
        try {
            System.out.println(x / y);
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No such element in array");
        }catch (RuntimeException e){
            System.out.println("Undefinite value");
        }
        System.out.println("END");
    }
}
