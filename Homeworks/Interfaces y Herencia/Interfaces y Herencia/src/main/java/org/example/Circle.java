package org.example;

public class Circle implements Polygon{
    public int sides = 0;
    public float radio;

    public Circle(float radio){
        this.radio = radio;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * (this.radio *this.radio));
    }

    @Override
    public int getSides() {
        return this.sides;
    }
}
