package Ch03_TernaryAndSwitch.Chalanges;

import java.util.Scanner;

public class ScoreCheck {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Score Checker");
        System.out.print("Enter the Total Marks value :");
        int totalMarks = input.nextInt();
        System.out.print("Enter the Obtain Marks value :");
        int obtainMarks = input.nextInt();
        int userMarksPersent =MarksPersent(totalMarks, obtainMarks);

        String marksStatus = userMarksPersent >= 80 ? "High"
                : (userMarksPersent >= 50 ? "Moderate" : "Low");
        System.out.println("Marks status is : " + marksStatus);
        input.close();
    }

    public static int MarksPersent (int totalMarks, int obtainMarks){
        return (obtainMarks * 100) / totalMarks;
    }

}
