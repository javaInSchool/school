package sorting_arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
//        al.add("Serg");
//        al.add(1);
//        al.add(5.6);
//        System.out.println(al.size());

//        ArrayList<String> texts = new ArrayList<>();
//        texts.add(""+1);
//        System.out.println(texts.get(0));
//        int x = texts.get(0);
        ArrayList<Student> studentsList = new ArrayList<>();
        Student s1 = new Student("Serg", 22, 10.6);
        studentsList.add(s1);
        studentsList.add(new Student("Oleh", 99, 7.9));
        System.out.println(studentsList.get(1));
        studentsList.add(new Student("Serg", 21, 12.0));
        studentsList.add(new Student("Max", 21, 4.5));
        studentsList.add(new Student("Alex", 23, 10.6));
        studentsList.sort(new ComparatorByName());

        ListIterator<Student> it = studentsList.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\n");
        }
    }



}

class Student{
    String name;
    int age;
    double results;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", results=" + results +
                '}';
    }

    public Student(String name, int age, double results) {
        this.name = name;
        this.age = age;
        this.results = results;
    }
    String getStudentName(){
        return this.name;
    }
}

class ComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        String StudentName1 = s1.getStudentName().toUpperCase();
        String StudentName2 = s2.getStudentName().toUpperCase();
            //ascending order
        return StudentName1.compareTo(StudentName2);
            //descending order
            //return StudentName2.compareTo(StudentName1);
    }
};