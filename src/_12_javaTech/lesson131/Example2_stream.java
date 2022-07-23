import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example2_stream {
    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("Serg", 38));
        pList.add(new Person("Dasha", 7));
        pList.add(new Person("Ann", 3));
        pList.add(new Person("Alex", 6));
        pList.add(new Person("Victory", 18));

        //for(Person p : pList){
        //    System.out.println(p);
        //}
        //Declarative

        //output All records
        //pList.stream().forEach( (Person p) -> System.out.println(p));
        //pList.stream().forEach( System.out::println);

        //output only > 18 records
        //pList.stream().filter( p -> {
        //    return p.getAge() >= 18;
        //});
        //or
        //pList.stream().
        //        filter( p -> p.getAge() >= 18).
        //       forEach(System.out::println);
        //with sorting
        //pList.stream().
        //        filter( p -> p.getAge() >= 18).
        //        sorted( (p1, p2) -> p1.getName().compareTo(p2.getName())).
        //        forEach(System.out::println);
        //OR
        pList.stream().
                filter( p -> p.getAge() >= 18).
                sorted(Comparator.comparing(Person::getName)).
                forEach(System.out::println);

        //MapTo - transform list
        pList.stream().
                filter( p -> p.getAge() >= 18).
                sorted(Comparator.comparing(Person::getName)).
                map( p -> p.getName()).
                forEach(System.out::println);
        //Find average on Age
        double avAge = pList.stream().
                filter( p -> p.getAge() >= 18).
                mapToInt( p -> p.getAge()).average().getAsDouble();
        System.out.println(avAge);
    }
}
