package _9_exceptions.lesson106;

public class WrongDayException extends Exception{
    public WrongDayException(){}
    public WrongDayException(String s){
        super(s);
    }
}
