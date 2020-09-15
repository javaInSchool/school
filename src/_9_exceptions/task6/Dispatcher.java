package _9_exceptions.task6;

public class Dispatcher{
    public static void main(String[] args) throws Exception{
        // напишите ваш код тут
        try {
            method1();
        }catch (Exception1 e){System.out.println(e);}
            catch (Exception2 e){System.out.println(e);}
            catch (Exception3 e){System.out.println(e);}
    }
    public static void method1() throws Exception1,
            Exception2, Exception3{
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}
class Exception1 extends Exception{
}
class Exception2 extends Exception{
}
class Exception3 extends Exception{
}

