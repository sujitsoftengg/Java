package Ch14_Absctration.Chalanges.First;

public class Circle extends Shape {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
