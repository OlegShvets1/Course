package Lesson_8.Task_1;

/*    1.    Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0”
if number = 0 throw your own exception.  Arithmetic ex, Exception ex;

void method(int number) {
    if (number < 0) ...
    else if (number == 0) ...
}
*/

public class Task_1 {
    void method(int number) {
        if (number < 0) {
            System.out.println("Number < 0;");
        } else if (number > 0) {
            System.out.println("Number > 0;");
        } else if (number == 0) {
            throw new ArithmeticException();
        }

    }
}

