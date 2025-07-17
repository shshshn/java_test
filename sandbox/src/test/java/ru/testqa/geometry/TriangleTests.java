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

    @Test
    void wrongSide() {
        try {
            new Triangle(1,2,4);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {};
        try {
            new Triangle(5,-1,4);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {};
        try {
            new Triangle(4,2,-1);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {};
    }

    @Test
    void wrongSidesSumm() {
        try {
            new Triangle(10, 5, 2);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {};
    }

    @Test
    void equalTriangles1() {
        var t1 = new Triangle(3,4,5);
        var t2 = new Triangle(5,3,4);
        Assertions.assertEquals(t1,t2);
    }

}
