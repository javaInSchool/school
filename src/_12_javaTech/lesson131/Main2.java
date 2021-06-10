package _12_javaTech.lesson131;

public class Main2 {
    public static void main(String[] args) {
        String data = "a\\jdk-16\\bin\\java.exe\" \"-javaagent:C:\\Program Files\\JetBrains\\Intell";
        System.out.println(data.length());  //кількість символів
        System.out.println("Символ на 4 позиції: " + data.charAt(4));

        String s1 = "Serg";
        String s2 = "Olga";
        String s3 = "Serg";
        System.out.println(s1 == s2); //False
        System.out.println(s1 == s3); //True
        //RAM -> heap , pool
        String s4 = new String("Nikita");
        String s5 = new String("Nikita");
        System.out.println(s4 == s5); //False

        System.out.println(s4.equals(s5));
    }
}
