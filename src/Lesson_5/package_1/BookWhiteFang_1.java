package Lesson_5.package_1;
/*1. Create a simple class with some fields.
Demonstrate in your class how we can use initialization blocks. */
public class BookWhiteFang_1 {
    public static String nameOfTheAutor;
    public static int year;
    public static int edition;

    public BookWhiteFang_1(String nameOfTheAutor, int year, int edition) {
        this.nameOfTheAutor = nameOfTheAutor;
        this.year = year;
        this.edition = edition;
    }
    public static void main(String[] arg){
        BookWhiteFang_1 bookWhiteFang_1 = new BookWhiteFang_1("Jack London", 1906,1000);
        System.out.println("Name of the autor -  " + bookWhiteFang_1.nameOfTheAutor+"."  + "  Year - " + bookWhiteFang_1.year+"." +   "  Edition - " + bookWhiteFang_1.edition+".");

    }
}

