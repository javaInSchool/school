package _9_exceptions.lesson106;

public class Main2 {
    void checkDay() throws WrongDayException{
        int day = new java.util.Date().getDay();
        System.out.println(day);
        if(day != 3 && day != 5){
            throw new WrongDayException("СРД чи ПТН");
        }
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        try{ m.checkDay(); } catch(WrongDayException wde){
            System.out.println("Вибачте не прийомний день. " +
                    "Прийомні дні " + wde.getMessage());
        }
    }
}
