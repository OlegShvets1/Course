package Lesson_8.Task_5;

/*5. Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
public class Main {

    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {

    }

}
*/

public class Main_5 {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            System.err.println(e);
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}

