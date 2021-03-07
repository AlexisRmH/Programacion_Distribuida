package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Polygon myRect = new Rectangle(5.5f, 3.2f);
        Polygon mySquare = new Square(4.5f);
        Polygon myCircle = new Circle(2.1f);

        System.out.println(
                "RECTANGLE´S DATA" + "\n" +
                "sides: " + myRect.getSides() + " \n" +
                "area: " + myRect.getArea() + " \n"
        );

        System.out.println(
                "SQUARE´S DATA" + "\n" +
                "sides: " + mySquare.getSides() + " \n" +
                "area: " + mySquare.getArea() + " \n"
        );

        System.out.println(
                "CIRCLE´S DATA" + "\n" +
                "sides: " + myCircle.getSides() + " \n" +
                "area: " + myCircle.getArea() + " \n"
        );
    }
}
