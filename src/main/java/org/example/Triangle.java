package org.example;

public class Triangle implements Figure {
    double a;
    double b;
    double c;
    double heightA;
    String fColor;
    String bColor;


    public Triangle(double a, double b, double c, double heightA, String fColor, String bColor){
        this.a=a;
        this.b=b;
        this.c=c;
        this.heightA=heightA;
        this.fColor=fColor;
        this.bColor=bColor;

    }

    @Override
    public double area(){
       return a*heightA*0.5;
    }

    @Override
    public double perimeter(){
     return a+b+c;
    }

    @Override
    public String fillColor(){
    return  fColor;
    }

    @Override
    public String borderColor(){
    return bColor;
    }
}

