package Ch14_Absctration.Interface;

public class Sahiwal extends Cow {
    private int age;
    private boolean Surrogacy;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSurrogacy() {
        return Surrogacy;
    }

    public void setSurrogacy(boolean surrogacy) {
        Surrogacy = surrogacy;
    }

    public boolean Surrogacy(){
        if (Surrogacy){
            return true;
        }
        return false;
    }

    @Override
    public void babies() {
        if (this.age > 3 && Surrogacy){
            System.out.println("Cow Eligible for Baby in next 12th month");
        }else {
            System.out.println("Not Eligible");
        }
    }
}


