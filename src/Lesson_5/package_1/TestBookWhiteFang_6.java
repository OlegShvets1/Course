package Lesson_5.package_1;

/*6.    Take the classes from the task 1. Create a new test class.
        Import everything (*) from your created packages.
        Now try to create objects of your classes without specifying the packages in front of the class names.
        What happened? How can we avoid this?*/


import Lesson_5.package_1.*;

public class TestBookWhiteFang_6 {
    public  static void main(String[] arg){

        BookWhiteFang_1 a = new BookWhiteFang_1("Jack London", 1906,1000);
        System.out.println("Name of the autor - " + a.nameOfTheAutor+"."  + "  Year - " + a.year+"." +   " Edition - " + a.edition+".");
    }
}