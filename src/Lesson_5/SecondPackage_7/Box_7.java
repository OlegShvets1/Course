package Lesson_5.SecondPackage_7;



/*  7)  Answer the question: What is a package-private access? Create a simple program to demonstrate the package-private access.
        Tips:
        - Create two different packages
        - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
        - Create in one of the classes some package-private members(fields or methods).
        - In another two classes create objects of the class with package-private members and try to access its members.*/

import Lesson_5.FirstPackage_7.Footbal_7;
public class Box_7 {
    String BoxerName;
    int WeightCategory;

    public Box_7(String BoxerName, int WeightCategory) {
        this.BoxerName = BoxerName;
        this.WeightCategory = WeightCategory;}
    public static void main (String[]arg){
        Box_7 c = new Box_7("Klitchko", 98);

        System.out.println("Boxer name - " + c.BoxerName + " Weight category - " + c.WeightCategory);

        Footbal_7 a = new Footbal_7("Ronaldo", 38, 74);

        System.out.println("Name - "+a.Name+" Age - " + a.Age + " Weight - "+ a.Weight);

        System.out.println("class Tenis_7 has Package-private access prevents the content of a class from being used outside of that package ");

    }
}
