import java.util.*;

class Student implements Comparable<Student> {

    int marks;
    String name;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // COMPARABLE
    // Default sorting: marks ascending
    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }

    @Override
    public String toString() {
        return name + " " + marks;
    }
}


// COMPARATOR
// Custom sorting: names ascending
class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 80));
        students.add(new Student("Aman", 90));
        students.add(new Student("Rohan", 80));
        students.add(new Student("Priya", 95));

        // COMPARABLE
        Collections.sort(students);

        System.out.println("Comparable:");
        System.out.println(students);


        // COMPARATOR
        Collections.sort(students, new StudentComparator());

        System.out.println("Comparator:");
        System.out.println(students);
    }
}