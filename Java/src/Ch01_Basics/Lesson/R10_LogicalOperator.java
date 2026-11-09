package Ch01_Basics.Lesson;

public class R10_LogicalOperator {
    static void main() {
        System.out.println("Welcome to the Logical Operator Chapter");

        boolean hasDrivingLicence = true;
        boolean hasCar = true;
        boolean hasCarStart = true;
        boolean hasBikeStart = false;
        boolean hasGround = false;

        // Logical And (&&) - True only if both are true
        boolean canDrive = hasDrivingLicence && hasCar;
        System.out.println("Can drive ? " + canDrive);

        // Logical OR (||) - True if AT LEAST ONE is true;
        boolean canDriveinGround = hasCarStart || hasBikeStart;
        System.out.println("Can Drive in Ground ? " + canDriveinGround);

        //Logical Not (!) - Invert the boolean value
        boolean canNotDrive = !hasDrivingLicence;
        System.out.println("Is Completely unable to drive ? " + canNotDrive);

    }
}
