package ru.testqa.geometry;
import java.math.*;

public class Triangle {

    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double a, double b, double c){
        this.aSide = a;
        this.bSide = b;
        this.cSide = c;
    }

    public double Perimeter(){
        return this.aSide + this.bSide + this.cSide;
    }

    public double Area(){
        double p = this.Perimeter()/2;
        return Math.sqrt(p*(p-this.aSide)*(p-this.bSide)*(p-this.cSide));
    }
}
