package java7.object_oriented_prog.lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //нумерация начинается с 0
        String text = "! Java forever  !!!";
        System.out.println( text.indexOf('a',7));
        System.out.println( text.indexOf("a"));
        System.out.println( text.length() );
        System.out.println( text.charAt(10) );


        System.out.println( text.indexOf("a"));
        System.out.println( text.indexOf('a',2));

        System.out.println( text.indexOf("j"));

        String data = ";sjkdvjhvjkcnjdsndnfjkdan" +
                "sjkldhfjksdahrgsdfgfsdfsdjkvjkshdjknsd" +
                " jk;asdhgfuiahgfhsd$%%^ggjkd#%2";
        System.out.println(data.length());

        int count = 0;
        for (int i = 0; i < data.length(); i++ ){
            System.out.println( data.charAt(i) );
            if (data.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("Кол-во букв \"а\" :" + count);

    }
}
