package stringBuilderEx;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Oleg","Serg",
        "Bob","Bohdan","Lucy","Andrew"};
        StringBuilder sb = null;
        for (int i = 0; i < names.length; i++){
            if(names[i].length() > 3){
                sb = new StringBuilder(names[i]);
                sb.setCharAt(3,'A');
                names[i] = sb.toString();
            }
        }
        for (String temp: names) {
            System.out.println(temp + " ");
        }
    }
}
