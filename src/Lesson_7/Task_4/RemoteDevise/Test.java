package Lesson_7.Task_4.RemoteDevise;

public class Test {
    public static void main(String[] arg){
        RemoteControler remoteControler = new RemoteControler(7,15);
        remoteControler.powerOn();
        remoteControler.setChannel(16);
        remoteControler.currentChannel();
        remoteControler.downVolume();
        remoteControler.upVolume();
        remoteControler.mute();
        remoteControler.powerOff();
    }

}
