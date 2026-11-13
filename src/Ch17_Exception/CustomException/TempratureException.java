package Ch17_Exception.CustomException;

public class TempratureException extends Exception {
    private double degrees;

    // constructure
    public TempratureException(double degrees){
        this.degrees = degrees;
    }

    // override get message of exception
    @Override
    public String getMessage(){
        return "The temperature (" + degrees + "C) isn't in the normal range.";
    }

    // geteer
    public double getDegrees(){
        return degrees;
    }


}
