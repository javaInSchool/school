package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Mila");
        set.add("Ramu");
        set.add("Ramu");
        set.add("Moidodir");
        set.add("Ads");
        // отримання ітератора для безлічі
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){   // перевірка, чи є ще елементи 
            // отримання поточного елемента і перехід на наступний
            String text = iterator.next();
            System.out.println ( text );
        }

    }
}
