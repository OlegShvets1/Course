package Lesson_7.Task_3;

public class MyDeviceTest {

    public static void main(String[] arg) {
        MyDevice myDevice = new MyDevice();
        myDevice.changeVolume(1);
        myDevice.on();
        myDevice.changeVolume(2);
        myDevice.changeVolume(15);
        myDevice.changeVolume(5);
        myDevice.changeVolume(0);
        myDevice.off();

        }
    }

