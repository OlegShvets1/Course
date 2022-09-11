package Lesson_5;
/*Write your own example of the recursive function. You can find a lot of examples on the Internet.*/


public class Factorial_3 {
    static int fact(int n) {
        if (n <= 1) return 1;
        return fact(n - 1) * n;
    }

    public static void main(String[] arg) {
        System.out.println(fact(5));
    }
}
