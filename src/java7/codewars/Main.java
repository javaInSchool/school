package java7.codewars;

public class Main {
    public static void main(String[] args) {
        System.out.println(duplicateCount(""));
    }
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int counter = 0;
        char c;
        while (!text.equals("")){
            //System.out.println(text);
            c = text.charAt(0);
            for (int i = 1, n = text.length(); i < n; i++){
                if (text.charAt(i) == c){
                    text = text.replaceAll("["+c+"]", "");
                    counter++;
                    break;
                }
            }
            text = text.replaceAll("["+c+"]", "");
        }

        return counter;
    }

}
