package Lesson_5.SecondPackage_5;

/*      5. Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
        Create a third class with the main method.
        In the main method create two different objects of your classes specifying the full name of the classes (including packages). */
import Lesson_5.FirstPackage_5.modulename;

public class TestModulename_5 {
    public static void main (String[] arg){
        Lesson_5.FirstPackage_5.modulename a = new Lesson_5.FirstPackage_5.modulename("Apple", 10, "Pear");
        System.out.println(a.d+"  "+a.n+"  "+a.x);
        Lesson_5.SecondPackage_5.modulename b = new Lesson_5.SecondPackage_5.modulename(12, 14343, "Cucumber");
        System.out.println(b.a+"  "+b.b+"  "+b.c);
    }
}
