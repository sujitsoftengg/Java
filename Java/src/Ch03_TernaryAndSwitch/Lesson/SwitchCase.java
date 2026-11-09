package Ch03_TernaryAndSwitch.Lesson;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi Welcome to Week Name Finder");
        System.out.print("Please enter number of day: ");
        int day = input.nextInt();

        String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] myWork = {"DSA", "System Design", "Computer Network", "Engg. Math", "Python", "Development"};
        // Switch Case
        switch (day) {
            case 1:
                System.out.println(weekDay[day-1]);
                break;
            case 2 :
                System.out.println(weekDay[day-1]);
                break;
            case 3:
                System.out.println(weekDay[day-1]);
                break;
            case 4:
                System.out.println(weekDay[day-1]);
                break;
            case 5:
                System.out.println(weekDay[day-1]);
                break;
            case 6:
                System.out.println(weekDay[day-1]);
                break;
            case 7:
                System.out.println(weekDay[day-1]);
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;
            case 6:
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        String output = switch (day) {
            case 1, 2, 3, 4, 5, 6 -> myWork[day-1];
            case 7 -> "Rest Day";
            default -> "Invalid Day";
        };
        System.out.println(output);



    }
}
