package Lesson_7.Task_3;

public class MyDevice implements Volume, State {

    private double value;


    @Override
    public void changeVolume(double value) {
        this.value = value;
        System.out.println("Sound level is - " + value);
    }

    @Override
    public void on() {
        if (value <=0) {System.out.println("The music is not playing");}
        else if ( value <= 5) {
            System.out.println("The music plays softly");
        }
        else  if (value <= 10) {
            System.out.println("Music plays at medium volume");
        }
        else if (value <= 15) {
            System.out.println("The music is playing loudly");
        } else {
            System.out.println("The music is playing very loud");
        }

    }

    @Override
    public void off() {
        if (value <= 0) {
            System.out.println("The music stopped playing");
        } else {
            System.out.println("Music is playing ");
        }
    }
}




