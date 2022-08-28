package Lesson_5;

/*      Create a new class. Make it impossible to create a new object of this class using a constructor.
        Provide an appropriate public method that will allow clients of your class create a new object.*/

public class Paralelepiped_10 {
    int a;
    int b;
    int c;

    private Paralelepiped_10() {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    {
        a = 10;
        b = 20;
        c = 30;
    }
    public static Paralelepiped_10 makeParalelepiped_10(){
        return new Paralelepiped_10();
    }
}