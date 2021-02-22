package _8_interface_innerclass.lesson91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 8, 1, -6};

        int index = Arrays.binarySearch(numbers, 1);
        System.out.println(index);

        Arrays.sort(numbers);
        for (int temp: numbers) {
            System.out.print(temp + " ");
        }

        index = Arrays.binarySearch(numbers, 1);
        System.out.println("\n"+index);

        ArrayList list = new ArrayList();
        list.add(6);
        list.add("Serg");
        list.add(new Cat("Myrzik",5));

        for (Object o: list) {
            System.out.println(o.toString());
        }
        System.out.println(list);

        System.out.println(list.get(1));
        //Cat c = (Cat)list.get(1);
        //System.out.println(c);

        ArrayList<Cat> catList = new ArrayList<Cat>();
        //catList.add(8); //error
        catList.add(new Cat("Vaska",3));
        catList.add(new Cat("Maruska",4));
        catList.add(new Cat("Jesus",2021));

        System.out.println(catList);
        catList.remove(1);
        System.out.println(catList);

        Cat[] array = new Cat[catList.size()];
        catList.toArray(array); //из списка в массив
        for(Cat temp: array){
            System.out.println(temp);//до сортировки
        }
        Arrays.sort(array);
        for(Cat temp: array){
            System.out.println(temp);//осле сортировки
        }

        catList.add(new Cat("Venya",1));
        catList.sort(new SortByAge());
        System.out.println("------------");
        System.out.println(catList);


    }
}
