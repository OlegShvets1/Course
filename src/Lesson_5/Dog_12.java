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

    public  void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public static int getWeight() {
        return weight;
    }

    public  void setWeight(int weight) {
        this.weight = weight;
    }

    public static String getColor() {
        return color;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    public static String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] arg) {
        Dog_12 dog_12 = new Dog_12();
        dog_12.setName("Rokky");
        dog_12.setColor("black");
        dog_12.setAge(3);
        dog_12.setWeight(12);
        dog_12.setBreed("Terrier");
        System.out.println("Name - " + getName() + "; Color - " + getColor() + "; Age - " + getAge() + "; Weight - " + getWeight() + "; Breed - " + getBreed()+";");
    }
}
