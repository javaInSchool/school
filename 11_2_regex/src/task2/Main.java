package task2;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("В русском тексте " +
                "каждую букву заменить ее порядковым номером " +
                "в алфавите. При выводе в одной строке печатать " +
                "текст с двумя пробелами между буквами, в " +
                "следующей строке внизу под каждой буквой печатать" +
                " ее номер.");
        StringBuilder sb2 = new StringBuilder("");
        for (int i = 0, n = sb.length(); i < n; i++) {
            if(sb.charAt(i) != ' ') {
                sb2.append(sb.charAt(i)+"  ");
            }
        }
        System.out.println(sb2);
        //повторять столько раз сколько букв
        //        если после буквы пробел - добавляем 1 пробел
        //        если нет пробела - добавляем 2 пробела
    }
}
