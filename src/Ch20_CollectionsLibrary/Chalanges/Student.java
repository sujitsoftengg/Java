package Ch20_CollectionsLibrary.Chalanges;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student {
    private String name;
    private char grade;

    // Constructon
    public Student(String name, char grade){
        this.name = name;
        this.grade = grade;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name : ").append(name).append(", ");
        str.append("Grade : ").append(grade).append(", ");
        return str.toString();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    static void main() {

        PriorityQueue<Student> ClassFirst = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getGrade(), o2.getGrade());
            }
        });

        ClassFirst.offer(new Student("Sujit", 'A'));
        ClassFirst.offer(new Student("Rahul", 'B'));
        ClassFirst.offer(new Student("Amit", 'A'));
        ClassFirst.offer(new Student("Sumit", 'C'));

        System.out.println("Queue is : " + ClassFirst);
        System.out.println(ClassFirst.peek());
        System.out.println("Poll Result : " + ClassFirst.poll());
        System.out.println("Poll Result : " + ClassFirst.poll());
        System.out.println("Poll Result : " + ClassFirst.poll());


    }
}
