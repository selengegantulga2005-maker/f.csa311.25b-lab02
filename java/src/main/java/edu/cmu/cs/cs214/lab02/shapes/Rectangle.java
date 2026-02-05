package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
     private final double height; // BITUUMJLEL
    private final double width;
        // dursuudiin ugugdul bugd public ucir bituumjleed 

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
 @Override
    public double getArea() {
        return height * width;
    }
        @Override
    public void draw() {
        System.out.println("Drawing Rectangle, area = " + getArea());
    }
}
