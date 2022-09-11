package Lesson_6.Task_4;

public class TestRose {
    public  static void main(String[] arg){
        Flover flover = new Flover("Сhamomile", "white", 41);
        System.out.println("Flover name - " + flover.name +"; Color - "+flover.color+"; Number of petals - "+flover.numberOfPetals+";");
        flover.bloom();
        flover.grow();
        System.out.println();

        Flover roze = new Flover("Tulip", "red", 7);
        Rose rose = new Rose(77);
        System.out.println("Flover name - " + rose.name +"; Color - "+rose.color+"; Number of petals - "+rose.numberOfPetals+"; Highth - "+rose.highth+" sm;");
        rose.bloom();
        rose.grow();
    }
}

