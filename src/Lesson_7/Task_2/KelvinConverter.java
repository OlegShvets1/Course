package Lesson_7.Task_2;

public class KelvinConverter implements Converter{
    @Override
    public void convert(double celsius) {
       double Kelvin;
       Kelvin= celsius+273.15;
       System.out.println(celsius+" degrees Celsius is - "+ Kelvin+" degrees Kelvin;");
    }
}
