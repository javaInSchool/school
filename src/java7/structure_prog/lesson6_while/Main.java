package java7.structure_prog.lesson6_while;

public class Main{
    public static void main(String[] args) {
        int weight = 10; // собрали 10 кг яблок
        int result = 35; // 10 + 15 + 20
        int temp = 0;
        int days = 1;

        temp = weight;          //сохраняем значение веса яблок за 1 сегоднешний день

        while(weight <= result){
            temp = temp + 5;       //каждый день вес собраных яблок увеличиваеться на 5 кг
            weight = weight + temp;
            days++;                 //счетчик дней
        }
        System.out.println("Дней: " + days);
    }
}

