package Lesson_5;

public class ParalelepipedTest_10 {
    public static void main(String[] arg) {
        ///Paralelepiped_10 p = new Paralelepiped_10(12, 12, 34);
        System.out.println("System.out.println(p.a + p.b + p.c) - Paralelepiprd_10(int,int,int) has private access in Paralelepiprd_10");
        Paralelepiped_10 p1= Paralelepiped_10.makeParalelepiped_10();
        System.out.println(p1.a);
        int d = p1.b+ p1.c;
        System.out.println(d);
    }
}
