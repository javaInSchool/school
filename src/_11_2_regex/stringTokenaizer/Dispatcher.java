import java.util.StringTokenizer;
//REGular EXpressions
public class Dispatcher {
    public static void main(String[] args) {
        String s = "String, which we want to decompose" +
                " in words and count them ? trme";
        StringTokenizer st = new StringTokenizer(s, " \t \n \r , .");
        int count = 0;
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            count++;
        }
        System.out.println(count);
    }
}
