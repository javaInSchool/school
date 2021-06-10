package java7.codewars;

public class Test7Level {
    public static void main(String[] args) {

        System.out.println(splitInParts("HelloKata",3));
    }

    public static String splitInParts(String s, int partLength) {
        String result = "";
        // s = "abcd";
        int parts = s.length() / partLength;
        for (int i = 0; i < parts; i++){
            result += s.substring(0, partLength) + " ";
            s = s.substring(partLength);
        }
        return result + s;
    }
}
