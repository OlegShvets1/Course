package Lesson_5.SecondPackage_7;

//import Lesson_5.SecondPackage_7.Box_7;
import Lesson_5.FirstPackage_7.Footbal_7;


public class Test_7 {
    public static void main (String[]arg){
        Box_7 c = new Box_7("Klitchko", 98);

        System.out.println("Boxer name - " + c.boxerName + " Weight category - " + c.weightCategory);

        Footbal_7 a = new Footbal_7("Ronaldo", 38, 74);

        System.out.println("Name - "+a.name+" Age - " + a.age + " Weight - "+ a.weight);

        System.out.println("class Tenis_7 has Package-private access prevents the content of a class from being used outside of that package ");

    }
}
