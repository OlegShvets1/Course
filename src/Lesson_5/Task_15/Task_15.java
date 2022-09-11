package Lesson_5.Task_15;

/*  15. Create a class with two different methods and two fields. One of methods should be static, another - non-static.
        The same thing should be done with class fields(first - static, second - non-static).
        These two methods should change the corresponding fields of the class when called.
        Create another class with main method to test your code.   */

public class Task_15 {
    static int staticField;
    int dynamicField;

    static void change(int value) {
        staticField = value;
        System.out.println("staticField = " + staticField);
        Task_15 task_15 = new Task_15();
        task_15.dynamicField = value+1;
        System.out.println("dynamicField = " + task_15.dynamicField);

    }

    public void anotherChange(int value) {
        staticField = value;
        System.out.println("staticField - " + staticField);
        dynamicField = value+1;
        System.out.println("dynamicField - " + dynamicField);
    }
}
