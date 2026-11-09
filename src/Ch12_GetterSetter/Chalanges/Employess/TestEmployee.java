package Ch12_GetterSetter.Chalanges.Employess;

public class TestEmployee {
    static void main(String[] args) {

        Employee firstEmployee = new Employee("Sujit Tomar", 26, 500000);

        firstEmployee.displayEmployeeDetails();

        firstEmployee.setAge(15);
        firstEmployee.setName("Aman");
        firstEmployee.displayEmployeeDetails();

    }

}
