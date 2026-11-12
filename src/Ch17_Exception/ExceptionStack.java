package Ch17_Exception;

import java.lang.Exception;

public class ExceptionStack {

    public void firstCall(){
        secondCall();
    }

    public void secondCall(){
        thirdCall();
    }

    public void thirdCall(){
        fourthCall();
    }

    public void fourthCall(){
        fifthCall();
    }

    public void fifthCall(){
        throw new IllegalArgumentException();
    }

    static void main(String[] args) {
        ExceptionStack myEx = new ExceptionStack();
        ExceptionStack handleEx = new ExceptionStack();

        try {
            handleEx.firstCall();
        }catch (Exception e){
            System.out.println("Exception Msg : " + e);
        }

        myEx.firstCall();

    }


}
