package Lesson_6.Task_3;

public class Hyundai extends Car {
    private String fuelType;

    public Hyundai(String fuelType) {
        super("Hyundai Santa Fe", "2114*5444", 3000, 2400);
        this.fuelType = fuelType;

    }
    public String getFuelType() {
        return fuelType;}

    public void checkFuelLevel(int fuelLevel) {

        System.out.println("The fuel level is - " +0.7*fuelLevel+ " liters.");
    }
    public void stop(){
        System.out.println("At the end of the road our car stops");
    }

}

