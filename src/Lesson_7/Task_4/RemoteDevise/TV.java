package Lesson_7.Task_4.RemoteDevise;

public class TV extends TVDevice {
    int volumeLevel;
    int channelNumber;
    TV(int volumeLevel, int channelNumber){
       this.volumeLevel = volumeLevel;
       this.channelNumber = channelNumber;
    }


    @Override
    public void powerOn() {
        System.out.println("The TV turns on;");

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Channel number is - " + channel);
    }

    @Override
    public void currentChannel() {
        System.out.println("The current Channel  is - "+ channelNumber+";");
    }

    @Override
    public void upVolume() {
        System.out.println("Make the sound louder; " +  "Was - " + volumeLevel +", became - "+(volumeLevel+1)+";");
    }

    @Override
    public void downVolume() {
        System.out.println("Make the sound quieter; " +  "Was - " + volumeLevel +", became - "+(volumeLevel-1)+";");
    }

    @Override
    public void mute() {
        if (volumeLevel==0){System.out.println("There is no sound");}
        else {System.out.println("Sound is present and its level is - " + volumeLevel);}

    }
    @Override
    public void powerOff() {
        System.out.println("Еhe TV turns off ");

    }
}
