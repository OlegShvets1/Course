package Lesson_5;

/*10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.*/

public class Computer4 {
    public void system(int a) {
        System.out.println(a);
    }

    public void system(int b, String sum, long c) {
        System.out.println(b + " " + sum + " " + c);
    }
}