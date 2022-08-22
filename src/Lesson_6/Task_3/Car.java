package Lesson_6.Task_3;

public class Car extends Vehicle {

    private int engine;
    private int weight;

    public Car(String name, String size, int engine, int weight) {
        super(name, size);
        this.engine = engine;
        this.weight = weight;
    }
    Vehicle vehicle;
    public int getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public void steer(char direction) {
        switch (direction) {
            case 'R':
                System.out.println("Our Car is turning right");
                break;
            case 'L':
                System.out.println("Our Car is turning left");
                break;

            default:
                System.out.println("Our Car is not turning.");
                break;
        }

    }

    public void move(char gear) {
        switch (gear) {
            case 'R':
                System.out.println("Our Car is in reverse.");
                break;
            case '1':
                System.out.println("Our Car is in first gear.");
                break;
            case '2':
                System.out.println("Our Car is in second gear.");
                break;
            case '3':
                System.out.println("Our Car is in third gear.");
                break;
            case '4':
                System.out.println("Our Car is in fourth gear.");
                break;
            case '5':
                System.out.println("Our Car is in fifth gear.");
                break;
            case 'N':
            case 'n':
                System.out.println("Our Car is in neutral.");
                break;

            default:
                System.out.println("Transmission in our Car is not enabled.");
                break;
        }

    }

    public void carRadio() {
        System.out.println("Car radio play 96.6Fm");
    }

    public void speedHigher(int actualSpeed) {
        actualSpeed = actualSpeed + 10;
        System.out.println("Our speed is - "+ actualSpeed+" km/h");
    }

    public void speedLower(int actualSpeed) {
        actualSpeed = actualSpeed - 1;
        System.out.println("Our speed is -  "+actualSpeed+" km/h");
    }


}


