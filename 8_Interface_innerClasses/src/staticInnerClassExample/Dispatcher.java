package staticInnerClassExample;

public class Dispatcher{
    public static void main(String[] args) {
        Math.Factorial fact = Math.getFactorial(6);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());
    }
}

class Math{
    static class Factorial{
        int result;
        int key;
        public Factorial(int number, int x){
            this.result=number;
            this.key = x;
        }
        public int getResult(){
            return result;
        }
        public int getKey(){
            return key;
        }
    }
    public static Factorial getFactorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++){
            result *= i;
        }
        return new Factorial(result, x);
    }
}
