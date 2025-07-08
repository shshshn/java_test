public class Geometry {
    public static void main(String[] args) {
        var side = 5;
        printSquareArea(side);

    }

    static void printSquareArea(double side){
        System.out.println("Площадь квадрата со стороной " + side + " = " + ( side * side));
    }
}
