public class Dispatcher {
    public static void main(String[] args) {
        int x = 7;
        int y = 0;
        //System.out.println(x/y);
        try{
            System.out.println(x/y);
        }catch(ArithmeticException ae){
            System.out.println("НЕ делите на 0!!!");
        }

        int[] z = {1,2,3};
        System.out.println(z[3]);
    }
}

