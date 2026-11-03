package org.example;

public class Circle implements Figure  {
    double radius;
    String fColor;
    String bColor;

    public Circle(double radius, String fColor, String bColor){
        this.radius=radius;
        this.fColor=fColor;
        this.bColor=bColor;
    }

    @Override
    public double area(){
        return  Math.PI* radius*radius;
    }

   @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String fillColor(){
        return fColor;
    }

    @Override
    public String borderColor(){
        return bColor;
    }

}
