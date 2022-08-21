package Lesson_5;

/* 12. Create a new class. Add 5 private fields. Add getter and setters to all the fields.*/


public class Dog_12 {

    private static String name;
    private static int age;
    private static int weight;
    private static String color;
    private static String breed;

    public Dog_12(String name, int age, int weight, String color, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.breed = breed;
    }

    public Dog_12() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Dog_12.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Dog_12.age = age;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Dog_12.weight = weight;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Dog_12.color = color;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        Dog_12.breed = breed;
    }

    public static void main(String[] arg) {
        Dog_12 dog_12 = new Dog_12();
        setName("Rokky");
        setColor("black");
        setAge(3);
        setWeight(12);
        setBreed("Terrier");
        System.out.println("Name - " + getName() + "; Color - " + getColor() + "; Age - " + getAge() + "; Weight - " + getWeight() + "; Breed - " + getBreed()+";");
    }
}
