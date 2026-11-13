package Ch17_Exception.CustomException;

public class TempratureChecker {

    public void checkTemprature(double temp) throws TempratureException{

        if (temp < 0 || temp > 45){
            throw new TempratureException(temp);
        }

        System.out.println("Temprature is normal : " + temp);
    }

    static void main(String[] args) {
        TempratureChecker TempCheck = new TempratureChecker();

        try {
            TempCheck.checkTemprature(20);
        }catch (TempratureException e){
            System.out.println("Custom Exception : " + e.getMessage());
            System.out.println("Invalid Temprature " + e.getDegrees() + "C");
        }


        try {
            TempCheck.checkTemprature(50);
        }catch (TempratureException e){
            System.out.println("Custom Exception : " + e.getMessage());
            System.out.println("Invalid Temprature " + e.getDegrees() + "C");
        }


    }


}
