package org.example;

public class Square implements Polygon{
    public int sides = 4;
    public float sideLength;

    public Square (float sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public float getArea() {
        return this.sideLength * this.sideLength;
    }

    @Override
    public int getSides() {
        return this.sides;
    }
}
