package Lesson_6.Task_4;

/*  4)   Create a class A. Add several fields, two methods and parameterized constructors to it.
         Create a class B that extends class A.
         Demonstrate in you program how class's B constructor should call class's A constructor to create a new object.
         Override one method of the class A to fully change it's behavior. Override another method to add some
         extra functionality to it, but it should then call class's A method.
         Create a test class and create several objects of class A and class B and call their methods.*/

public class Rose extends Flover {
    double highth;

    public Rose(int highth) {
        super("Roze", "red", 32);
        this.highth = highth;
    }

    @Override
    public void bloom() {
        System.out.println("A rose is a flower, and therefore it also blooms");
    }

    @Override
    public void grow() {
        super.grow();
        double increase = 0.05;
        increase = increase * highth;
        System.out.println("The daily increase of roses is - " + increase + " - mm.");
    }
}

