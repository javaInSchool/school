package stringTokenaizer3;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String s = "This is a small string small";
        String find = "small";
        String change = "very large";
        StringBuffer result = new StringBuffer();

        StringTokenizer st = new StringTokenizer(s, "\t \r \n , .");
        int count = st.countTokens();

        String[] words = new String[count];
        count = 0;
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            if(temp.equals(find)){
                words[count++]= change;
            }else {
                words[count++] = temp;
            }
        }
        for (String temp: words) {
            result = result.append(temp+" ");
        }
        System.out.println(result);
    }
}
