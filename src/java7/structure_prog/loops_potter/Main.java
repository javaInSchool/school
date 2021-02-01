package java7.loops;

public class Main {
    public static void main(String[] args) {
        int numberOfDays = 5;
        int owl = 1;
        int post = 1;
        int sum = 0;

        sum = owl + post;
        for (int i = 0; i < numberOfDays - 1; i++) {
            owl = owl + 2;
            post = post*3;
            sum = sum + owl + post;
        }


        System.out.println("Кол-во писем за " + sum);
    }
}
