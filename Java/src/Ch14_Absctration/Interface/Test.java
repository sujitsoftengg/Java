package Ch14_Absctration.Interface;

public class Test {

    static void main(String[] args) {

//        Cow myCow = new Cow()  // 'Cow' is abstract; cannot be instantiated
        Sahiwal mySahiwal = new Sahiwal();
        Labrador myLabrador = new Labrador();

        mySahiwal.setSurrogacy(true);
        myLabrador.setAge(0);
        mySahiwal.setAge(8);

        mySahiwal.babies();
        myLabrador.babies();

    }

}
