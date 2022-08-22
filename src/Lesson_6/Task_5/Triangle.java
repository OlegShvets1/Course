package Lesson_6.Task_5;

public class Triangle extends Figure {

    public Triangle(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    public void calculateArea() {
        double S;
        S = width * height * 0.5;

        System.out.println("The area of triangle with sides " + width + " and " + height + " is - " + S);
    }

    public static void main(String[] arg) {
        Triangle triangle = new Triangle(25, 30);
        triangle.calculateArea();
    }
}


