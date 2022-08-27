package Lesson_7.Task_1;

public class Duck implements Flayable{
    @Override
    public void fly() {
        System.out.println("Since flyable includes ducks, then ducks can fly;");
    }
}
