package Lesson_5.SecondPackage_1;

public class BookWhiteFang_1 {
    public static String nameOfTheAutor;
    public static int year;
    public static int edition;

    static  {
        nameOfTheAutor = "Jack London";        // blocks of initialization.
        year = 1906;                          //
        edition = 20000;                    //
    }
    public BookWhiteFang_1(){}
    public BookWhiteFang_1(String nameOfTheAutor, int year, int edition) {
        this.nameOfTheAutor = nameOfTheAutor;
        this.year = year;
        this.edition = edition;
    }

}