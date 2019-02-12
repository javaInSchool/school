package stringTokenazer2;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String s = "Java forever. String, which we " +
                "want to decompose in words and count them.";
        StringTokenizer st = new StringTokenizer(s, " \t \n \r , .");
        int count = 0;
        StringBuffer result = new StringBuffer("");
        while(st.hasMoreTokens()){
            result = result.insert(result.length(), st.nextToken()+
                                    " "+ count+ " ");
            count++;
        }
        System.out.println(result);
    }
}
