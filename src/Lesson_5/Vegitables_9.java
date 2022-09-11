package Lesson_5;

/*   9. Answer the question: What is a private access? Create a simple program to demonstrate the private access.
        Tips:
        - Create two classes
        - In on of them create private members
        - In the second class create an object of the first class
        - Try to access the private members
        Private: The access level of a private modifier is only within the class.
        It cannot be accessed from outside the class.
        Приватний: рівень доступу приватного модифікатора доступний лише в межах класу.
        До нього неможливо отримати доступ поза класом.*/


public class Vegitables_9 {
    private String name;
    private int weight;
    String color;

    public Vegitables_9(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] arg) {
        Vegitables_9 v = new Vegitables_9("Beethroot", 340, "Red");
        System.out.println(v.name + "  " + v.weight + "  " + v.color);

    }
}

