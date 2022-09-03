package Lesson_8.Task_3;

/*     3.     Finish the program to handle all the possible exceptions:
* public class Main {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        int b = 10 / a;
        int[] c = {1};
        System.out.println(c[1]);

    }

}*/

public class Main_3 {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Divided by zero operation cannot possible");
            System.out.println("Element in the array was not found");
        }
    }
}
