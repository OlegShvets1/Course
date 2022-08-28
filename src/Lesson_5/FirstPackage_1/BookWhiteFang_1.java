package Lesson_5.FirstPackage_1;
/*1. Create a simple class with some fields.
Demonstrate in your class how we can use initialization blocks. */
public class BookWhiteFang_1 {
    public static String autorName;
    public static int year;
    public static int edition;

    static  {
        autorName = "Jack London";        // blocks of initialization.
        year = 1906;                          //
        edition = 20000;                    //
    }
    public BookWhiteFang_1(){}
    public BookWhiteFang_1(String autorName, int year, int edition) {
        this.autorName = autorName;
        this.year = year;
        this.edition = edition;
    }
    public static void main(String[] arg){
        BookWhiteFang_1 bookWhiteFang_1 = new BookWhiteFang_1();
        System.out.println("Name of the autor -  " + bookWhiteFang_1.autorName+"."  + "  Year - " + bookWhiteFang_1.year+"." +   "  Edition - " + bookWhiteFang_1.edition+".");

    }
}

