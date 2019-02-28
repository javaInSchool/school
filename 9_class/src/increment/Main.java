package increment;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 17;
        x++; // операція інкременту - збільшення на 1
        System.out.println(x); // x = 6
        x--; //операція декременту - зменшення на 1
        System.out.println(x); // x = 5

        y = x++; //операція "=" виконалась раніше за "++",
                // постфіксна форма інкременту
        System.out.println(y);
        y = ++x; //префіксна форма інкременту
        System.out.println(y);

        x = 6;
        y = 5;
        int z = x++ + y;         // z =
        z = x++ + y++ + ++x;     // z = 19
        z = x++ + y++ + x++;     // z =
    }
}