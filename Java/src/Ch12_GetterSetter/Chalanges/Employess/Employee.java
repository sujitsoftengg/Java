package Ch12_GetterSetter.Chalanges.Employess;

class Employee {
    private String name;
    private int age;
    private long salary;

    public String getName() {
        return name;
    }

    Employee(String name, int age, long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


    void displayEmployeeDetails(){
        StringBuilder str = new StringBuilder("Object Details is (");
        str.append("Employee Name : ").append(this.name);
        str.append(", age : ").append(this.age);
        str.append(", Salary : ").append(this.salary);
        str.append(")");
        System.out.println(str.toString());
    }
}
