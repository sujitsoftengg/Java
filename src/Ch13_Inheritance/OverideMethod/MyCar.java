package Ch13_Inheritance.OverideMethod;

import java.util.Objects;

public class MyCar {
    double price;
    String color;

    // Constructor
    MyCar(double price, String color){
        this.price = price;
        this.color = color;
    }

    // toString() method override
    @Override
    public String toString() {
       StringBuilder str = new StringBuilder();
       str.append("Car Price is ").append(this.price);
       str.append(" And Car color is ").append(this.color);
       return  str.toString();
    }

    // equal() override
    /*
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyCar)){
            return false;
        }
        MyCar car = (MyCar) obj;
        return car.color.equals(color) && car.price == price;
    }
    */


    //

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyCar car = (MyCar) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
