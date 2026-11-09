package Ch08_String.Chalanges;

public class StringChalanges01 {
    static void main(String[] args) {
        String firstName = "Sujit";
        String middleName = "Kumar";
        String lastName = "Singh";

        String fullName = firstName.concat(middleName).concat(lastName);

        System.out.println((firstName + " " + middleName + " " + lastName).toUpperCase());
        System.out.println(fullName.toUpperCase());

    }
}
