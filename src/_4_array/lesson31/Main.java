package _4_array.lesson31;

public class Main {
    public static void main(String[] args) {
        //заполнение 1-го массива
        int[] numbers1 = new int[ 1+(int)(Math.random()*10) ];
        for (int i = 0, n = numbers1.length; i < n; i++) {
            numbers1[i] = (int)(Math.random()*100*Math.pow(-1,i));
        }
        //заполнение 2-го массива
        int[] numbers2 = new int[ 1+(int)(Math.random()*10) ];
        for (int i = 0, n = numbers2.length; i < n; i++) {
            numbers2[i] = (int)(Math.random()*100*Math.pow(-1,i)); // 0.0 - 1.0
        }

        int avr1 = 0, avr2 = 0;

        //Находим среднее первого массива
        for (int temp: numbers1) {
            avr1 = avr1 + temp;
        }
        avr1 = avr1/numbers1.length;
        for (int temp: numbers1) {
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println(avr1);

        //Находим среднее второго массива
        for (int temp: numbers2) {
            avr2 = avr2 + temp;
        }
        avr2 = avr2/numbers2.length;
        for (int temp: numbers2) {
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println(avr2);

        //Создание 3-го массива как объединение 2-х начальных
        int[] result = new int[numbers1.length + numbers2.length];
        for (int i = 0, n = result.length; i < n; i++) {
            if(i < numbers1.length) {
                result[i] = numbers1[i];
            }else{
                result[i] = numbers2[i - numbers1.length];
            }
        }
        //Вывод на екран массива результата
        for (int temp: result) {
            System.out.print(temp + " ");
        }
        System.out.println();

        //Считаем сколько чисел между средними
        int count = 0;
        for (int temp:result) {
            if (avr1 > avr2){
                if(avr2 < temp & temp < avr1){
                    count++;
                }
            }else{
                if(avr1 < temp & temp < avr2){
                    count++;
                }
            }
        }

    }
}
