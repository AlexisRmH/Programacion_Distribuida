package org.example;

public class Rectangle implements Polygon{
    public int sides = 4;
    public float width;
    public float height;

    public Rectangle (float width, float height){
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    public int getSides() {
        return this.sides;
    }
}
