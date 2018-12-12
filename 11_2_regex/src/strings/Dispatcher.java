package strings;

public class Dispatcher {
    public static void main(String[] args) {
        String text = "abcd";
        String text2 = text;

        text = text.concat("efef");
        System.out.println(text);
        System.out.println(text2);

        System.out.println(text.charAt(1));
        System.out.println(text.endsWith("f"));
        System.out.println(text.endsWith("g"));

        System.out.println(text.indexOf("d"));
        System.out.println(text.indexOf(98,0));

        String myString = " Це " + " тестовий " + " рядок " + " Java. ";
        String name = "Name";
        String surname = "Surname";
        String fullName = name +" "+ surname;
        System.out.println(fullName);

        String t1 = "Java";
        String t2 = "Java";
        String t3 = new String("Java");
        if(t1 == t2){
            System.out.println("Equals");
        }
        if(t1 == t3){
            System.out.println("Equals");
        }
    }
}
