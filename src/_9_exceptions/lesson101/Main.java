package exception.lesson101;

public class Main {
    public static void main(String[] args) {
        //Throwable
        //Exception   Error
        //IOExciption, SQLException, RunTimeException
        System.out.println("START program");
        int x = 6;
        int y = 0;
        try {
            System.out.println("BEGIN try");
            System.out.println(x / y);
            System.out.println("END try");
        }catch(ArithmeticException ae){
            System.out.println("Деление на 0");
        }
        System.out.println("END program");

        int[] numbers = {1,4, -7, 2};

        System.out.println(numbers[10]);

    }
}
