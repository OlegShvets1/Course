package Lesson_5.FirstPackage_7;

/*  7)  Answer the question: What is a package-private access? Create a simple program to demonstrate the package-private access.
        Tips:
        - Create two different packages
        - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
        - Create in one of the classes some package-private members(fields or methods).
        - In another two classes create objects of the class with package-private members and try to access its members.
*/


/* package-private (often just called package) means that other members of the same package have access to the item.
 package-private is the default access modifier and does not have a keyword, because package is used to specify the
 package for a class or interface.
 package-private (часто просто називається пакетом) означає, що інші члени того самого пакету мають доступ до елемента.
 package-private є модифік тором доступу за умовчанням і не має ключового слова,
 оскільки пакет використовується для визначення пакета для класу або інтерфейсу.
 */


public class Footbal_7 {

    public String Name;
    public int Age;
    public int Weight;


    public Footbal_7(String Name, int Age, int Weight){
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;

    } public  static void main (String[] arg){
        Footbal_7 a = new Footbal_7("Ronaldo", 38, 74);

        System.out.println("Name - "+a.Name+" Age - " + a.Age + " Weight - "+ a.Weight);
        Tenis_7 b = new Tenis_7(80000, "Wiliams");
        System.out.println("Salary - "+b.Salary+" Name - "+ b.NameOfTenisist);

    }
}
