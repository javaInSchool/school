package user_exception;

public class Main {
    void doIt() throws WrongDayException{
        int dayOfWeek = (new java.util.Date()).getDay();
        if (dayOfWeek != 1 && dayOfWeek != 4)
            throw new WrongDayException("Вівторок або Четвер.");
        System.out.println("Все в порядку.");
    }
    public static void main(String[] args) {
        try{
            (new Main()).doIt();
        }catch (WrongDayException e){
            System.out.println("Вибачте, це можна зробити тільки у " +
                    e.getMessage());
        }
    }
}

class WrongDayException extends Exception{
    public WrongDayException(){}
    public WrongDayException(String msg){
        super(msg);
    }
}