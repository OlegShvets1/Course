package Lesson_7.Task_2;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double celsius) {
        double Fahrenheit;
        Fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " degrees Celsius is - " + Fahrenheit + " degrees Fahrenheit;");
    }
}
