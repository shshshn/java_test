package ru.testqa.geometry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void calculatePerimeter() {
        var a = new Triangle(5,5,3);
        Assertions.assertEquals(13, a.Perimeter());
    }

    @Test
    void calculateArea() {
        var a = new Triangle(3,4,5);
        Assertions.assertEquals(6,a.Area());
    }

}
