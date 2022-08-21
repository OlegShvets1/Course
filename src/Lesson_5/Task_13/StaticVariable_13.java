package Lesson_5.Task_13;

/*     13.    What is the different between static and non-static field of a class?
              Create an example to demonstrate this concept.
A static field, or static class variable within a class is accessible before an instance of that class is
created unlike instance variables. Instance variables (non-static variables) within a class are created
when an instance of that class is created at run-time.
На відміну від змінних екземпляра, статичне поле або змінна статичного класу в межах класу доступні до того,
як буде створено екземпляр цього класу. Змінні екземпляра (нестатичні змінні) у класі створюються,
коли екземпляр цього класу створюється під час виконання.
A static method can only access static data members and static methods of another class or same class but cannot
access non-static methods and variables. Also, a static method can rewrite the values of any static data member.
A non-static method can access static data members and static methods as well as non-static members and methods of
another class or same class, also can change the values of any static data member
*/

public class StaticVariable_13 {
    public static int variable = 15;
    public int variable2 = 100;

    public static void test() {
        System.out.println(variable);
        System.out.println("''System.out.println(variable2)''  -  Eror  -  it is not possible to refer to a non-static field in a static method");
    }

    public void test1() {
        System.out.println(variable2);
        System.out.println(variable);
    }
}
