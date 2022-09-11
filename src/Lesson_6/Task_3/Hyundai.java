package Lesson_6.Task_3;

public class Hyundai extends Car {
    private String fuelType;

    public Hyundai(String name, String size, int engine, int weight,String fuelType) {
        super();
        this.name = name;
        this.size = size;
        this.engine = engine;
        this.weight = weight;
        this.fuelType = fuelType;

    }
    public String getFuelType() {
        return fuelType;}

    public void checkFuelLevel(int fuelLevel) {

        System.out.println("The fuel level is - " +0.7*fuelLevel+ " liters.");
    }
    @Override
    public void stop(){
        System.out.println("At the end of the road our car stops");
    }

}

