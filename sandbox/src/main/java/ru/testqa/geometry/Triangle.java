package ru.testqa.geometry;
import java.math.*;
import java.util.Objects;

public class Triangle {

    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("Side can't be zero or negative");
        };
        if ( a+b < c || a+c < b || b+c < a){
            throw new IllegalArgumentException("Triangle inequality does not work");
        };
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        var r = (Double.compare(aSide, triangle.aSide) == 0 || Double.compare(aSide, triangle.bSide) == 0 || Double.compare(aSide, triangle.cSide) == 0) &&
                (Double.compare(bSide, triangle.bSide) == 0 || Double.compare(bSide, triangle.cSide) == 0 || Double.compare(bSide, triangle.aSide) == 0) &&
                (Double.compare(cSide, triangle.cSide) == 0 || Double.compare(cSide, triangle.aSide) == 0 || Double.compare(cSide, triangle.bSide) == 0);
        return r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aSide, bSide, cSide);
    }
}
