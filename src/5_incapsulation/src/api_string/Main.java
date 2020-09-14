package api_string;

public class Main {
    public static void main(String[] args) {
        String text = "To Sherlock Holmes she is always the woman. I have seldom heard him " +
                "mention her under any other name. In his eyes she eclipses and " +
                "predominates the whole of her sex. It was not that he felt any " +
                "emotion akin to love for Irene Adler. ";
        char ch = 'a';

        int i = 0;
        while(i != text.length()-1){
            i = text.indexOf(ch,i);
            if(i == -1){
                break;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
