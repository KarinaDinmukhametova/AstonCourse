package org.example;

public class Rectangle implements Figure {
   double widht;
   double height;
    String fColor;
    String bColor;
    public Rectangle(double widht, double height, String fColor, String bColor){
        this.widht=widht;
        this.height=height;
        this.fColor=fColor;
        this.bColor=bColor;
    }

    @Override
    public double area(){
        return widht*height;
    }

    @Override
    public double perimeter(){
        return widht+height+widht+height;
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
