package Lesson_6.Task_5;

public class Circle extends Figure {

    public Circle(double width) {
        this.width = width;

    }
@Override
    public  void calculateArea() {
        double s;
        s =  Math.PI * Math.pow(width,2);

        System.out.println("The area of rectangle with radius " + width + " is - " + s +".");
    }

    public  static void main (String[] arg){
        Circle circle = new Circle(10);
        circle.calculateArea();
    }
}


