package _9_exceptions.exception6;

public class Dispatcher {
    public static void main(String[] args) {

    }

    public static void method() throws WrongDayException {
        int day = (new java.util.Date()).getDay();
        if(day != 2 && day != 4) throw new WrongDayException
                ("Tuesday or Thursday");
        System.out.println("All right");
    }
}

class WrongDayException extends Exception{
    public WrongDayException(){}
    public WrongDayException(String msg){
        super(msg);
    }
}
