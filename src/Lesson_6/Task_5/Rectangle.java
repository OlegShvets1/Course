package Lesson_6.Task_5;

public class Rectangle extends Figure {

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    public  void calculateArea() {
        double S;
        S = width * height;

        System.out.println("The area of rectangle with sides " + width + " and " + height+ " is - " + S);
    }

    public  static void main (String[] arg){
        Rectangle rectangle = new Rectangle(15,24);
        rectangle.calculateArea();
    }
}
