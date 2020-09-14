import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(
                new File("src/practice_array/input.txt"));
        String data = null;
        if(input.hasNextLine()){
            data = input.nextLine(); //прочитати рядок
        }
        System.out.println(data);
        String[] fields = data.split(";"); //розбити рядок на частини
        for (String t: fields){
            System.out.println(t);
        }
        int x = Integer.parseInt(fields[2]);//перевести текст у число
        System.out.println(x);

        ArrayList<Item> itemsList = new ArrayList<>();
        Item temp = new Item();
        temp.type = fields[0];
        temp.price = Integer.parseInt(fields[1]);
        temp.ageLimit = Double.parseDouble(fields[2]);
        temp.special = Integer.parseInt(fields[3]);
        itemsList.add(temp);

    }
}

class Item{
    String type;
    int price;
    double ageLimit;
    int special;
}
