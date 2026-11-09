package Ch11_Encapsulation.Chalanges.com.example.utils;

import Ch11_Encapsulation.Chalanges.com.example.geometry.Circle;
import Ch11_Encapsulation.Chalanges.com.example.geometry.Rectangle;
import jdk.swing.interop.SwingInterOpUtils;

public class Calculator {

    static void main(String[] args) {
        Circle myCircle = new Circle(5.5);
        Rectangle myRectangle = new Rectangle(8, 5);

        double circleArea = Math.PI * (Math.pow(myCircle.getRadius(), 2));
        double rectangleArea = myRectangle.getLength() * myRectangle.getWidth();

        System.out.printf("Area of Circle is %f and Area of Rectanglre is %f", circleArea, rectangleArea);
        System.out.println();


        System.out.println(circleArea);
        System.out.println(rectangleArea);

    }
}
