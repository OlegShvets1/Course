package Lesson_7.Task_2;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double celsius) {
        double fahrenheit;
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " degrees Celsius is - " + fahrenheit + " degrees Fahrenheit;");
    }
}
