package Ch17_Exception;

public class FinalBlock {

    public void nameprint(String name) throws Exception {
        if (name.contains("-")){
            throw new IllegalArgumentException();
        }
        System.out.println(name);
    }

    static void main(String[] args) {
        FinalBlock myBlock = new FinalBlock();

        try {
            myBlock.nameprint("Sujit");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            myBlock.nameprint("Sujit-Tomar");
        }catch (Exception e){
            System.out.println("Exception Msg : " + e);
        }finally {
            // Finally block har setuation me execute hota hai
            System.out.println("Final Code Block Test");
        }




    }

}
