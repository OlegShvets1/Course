package Lesson_8.Task_6;

/*   6.   Write a program that will read numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of a number, this method should catch the exception and display all
previously entered numbers as a result. Each number should be printed from a new line preserving the order of the input.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_6 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number:");
        while (true) {
            try {
                int x = Integer.parseInt(bufferedReader.readLine());
                arrayList.add(x);

            } catch (Exception e) {
                for (int x : arrayList) {
                    System.out.println(x);
                }
            }
        }
    }
}
