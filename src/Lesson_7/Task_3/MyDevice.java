package Lesson_7.Task_3;

public class MyDevice implements Volume, State {

    private int value;

    @Override
    public void on() {
        if (value > 0) {
            System.out.println("The device turns on");
        }
    }

    @Override
    public void changeVolume(int value) {
        this.value = value;
        if (value < 0) {
            System.out.println("Enter the correct value, the sound value cannot be negative");
        } else {
            System.out.println("Sound level is - " + value);
        }
        switch (value) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("");
                break;
            case 2:
                System.out.println("The music plays softly");
                break;
            case 3:
                System.out.println("Music plays at medium volume");
                break;
            case 4:
                System.out.println("The music is playing loudly");
                break;
            case 5:
                System.out.println("The music is playing very loud");
                break;
            default:
                System.out.println("Enter a valid sound level from 0 to 5");
                break;
        }
    }


       @Override
    public void off() {
        if (value == 0) {
            System.out.println("The device turns off");
        }
    }

}



