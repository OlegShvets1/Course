package Lesson_6.Task_3;

/*   3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        Finally, create another class, a specific type of Car that inherits from the Car class.
        You should be able to hand steering, changing gears, and moving(speed in other words).
        You will want to decide where to put the appropriate state and behaviours(fields and methods).
        As mentioned above, changing gears, increasing/decreasing speed should be included.
        For you specific type of vehicle you will want to add something specific for that type of car.*/


public class TestHyundai {

    public static void main(String[] args) {

        Hyundai hyundai = new Hyundai("Hyundai Santa Fe", "2114*5444",3000,2400,"Diesel");
        System.out.println("Name - "+ hyundai.getName()+";  Size - " + hyundai.getSize()+";  Engine - "+hyundai.getEngine()+ ";  Weight - "+hyundai.getWeight()+"; Fuel -" + hyundai.getFuelType());
        hyundai.steer('R');
        hyundai.move('4');
        hyundai.speedLower(60);
        hyundai.steer('L');
        hyundai.move('5');
        hyundai.speedHigher(60);
        hyundai.carRadio();
        hyundai.checkFuelLevel(55);
        hyundai.stop();

    }
}
