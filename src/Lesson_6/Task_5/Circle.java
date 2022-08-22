package Lesson_6.Task_5;

public class Circle extends Figure {

    public Circle(double width) {
        this.width = width;

    }

    public  void calculateArea() {
        double S;
        S =  Math.PI * Math.pow(width,2);

        System.out.println("The area of rectangle with radius " + width + " is - " + S+".");
    }

    public  static void main (String[] arg){
        Circle circle = new Circle(10);
        circle.calculateArea();
    }
}


