package Lesson_5;

/*   9. Answer the question: What is a private access? Create a simple program to demonstrate the private access.
        Tips:
        - Create two classes
        - In on of them create private members
        - In the second class create an object of the first class
        - Try to access the private members*/


public class VegitablesTest_9 {
    public  static  void main(String[] arg){
        Vegitables_9 v = new  Vegitables_9("Tomat", 150, "Red");
        System.out.println("(v.Color) - "+v.color);
        System.out.println("(v.Name) - Eror: Name - has private access in Vegitables_9");
        System.out.println("(v.Weight) - Eror: Weight has private access in Vegitables_9");
    }
}
