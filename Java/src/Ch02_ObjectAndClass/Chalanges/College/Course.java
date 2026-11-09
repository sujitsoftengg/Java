package Ch02_ObjectAndClass.Chalanges.College;

public class Course {
    static int maxCapicity;

    String courseName;
    int enrollments;
    String[] enrolledStudents;
    Course(String CourseName) {
        this.courseName = CourseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapicity];
    }

    static void setMaxCapicity(int maxCapicity) {
        Course.maxCapicity = maxCapicity;
    }

    public void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    public void unenrollStudent(String studentName) {
        String removeStudenName = studentName;

        int index = 0;
        while (index < enrolledStudents.length) {
            if (enrolledStudents[index] != null && enrolledStudents[index].equals(removeStudenName)) {
                int i = 0;
                while (i < enrollments-1){
                    enrolledStudents[i] = enrolledStudents[i+1];
                }
                enrolledStudents[enrollments-1] = null;
                enrollments--;

                System.out.println("Student Unenrolled: " + removeStudenName);
                return;
            }
            index++;
        }
        System.out.println("Student not found: " + removeStudenName);

    }

}
