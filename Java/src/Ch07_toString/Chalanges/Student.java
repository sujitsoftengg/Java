package Ch07_toString.Chalanges;

public class Student {
    String StudentName;
    int roll;
    int age;

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Student Details - ");
        str.append("Student Name : ").append(StudentName);
        str.append(", Age : ").append(age);
        str.append(", Roll : ").append(roll);
        return str.toString();
    }

    public Student(String StudentName, int roll, int age){
        this.StudentName = StudentName;
        this.roll = roll;
        this.age = age;
    }

    static void main(String[] args) {
        Student SujitTomar = new Student("Sujit Kumar Singh", 136, 26);
        System.out.println(SujitTomar);
    }

}
