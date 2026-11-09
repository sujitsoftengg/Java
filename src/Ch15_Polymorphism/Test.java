package Ch15_Polymorphism;

public class Test {

    // Upcasting or general purpos method
    private static void VehicleTest(Vehicle vehicle){
        vehicle.start();
    }

    // Downcasting but in rarecase you can use this type method
    private static int noOfDoorCheck(Vehicle vehicle){
        if (vehicle instanceof Car){
            Car myVehicle = (Car) vehicle;
            return myVehicle.noOfDors();
        }
        return -1;
    }


    static void main(String[] args) {

//        Vehicle myVehicle = new Vehicle();

        Car myCar = new Car();
        Plane myPlane = new Plane();

        Vehicle personalCar = new Car(); // Upcasting

        /*

        Car personalVehicle = (Car) new Vehicle();   // Explicit Downcasting but it is Runtime error (ClassCastException)
        Car personalVehicle = new Vehicle();      // It is  also error Compile-time error

        */


        VehicleTest(myCar);
        VehicleTest(myPlane);
        VehicleTest(personalCar);


    }




}
