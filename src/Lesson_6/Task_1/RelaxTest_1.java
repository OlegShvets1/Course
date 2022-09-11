package Lesson_6.Task_1;

public class RelaxTest_1 {
    public  static  void main(String[] arg){
        Tv_1 tv= new Tv_1("ICTV");
        Radio_1 radio = new Radio_1("Song", "Times24;");
        Relax_1 relax= new Relax_1(tv, radio);
        relax.relax();
    }
}