package Ch14_Absctration.Chalanges.First;

public class Squar extends Shape{
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
