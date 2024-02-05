class ChristmasEntity {
    String greeting = "Merry Christmas!";

    void displayGreeting() {
        System.out.println(greeting);
    }
}

class SantaClaus extends ChristmasEntity {
    void bringGifts() {
        System.out.println("Santa Claus is bringing gifts!");
    }
}

class Reindeer extends ChristmasEntity {
    void illuminate() {
        System.out.println("The reindeer is illuminating!");
    }
}


public class Activity10_3_Cuesta {
    public static void main(String[] args) {

        SantaClaus santa = new SantaClaus();
        System.out.println("Santa Claus:");
        santa.displayGreeting();
        santa.bringGifts();

        System.out.println();

        Reindeer reindeer = new Reindeer();
        System.out.println("Reindeer:");
        reindeer.displayGreeting();
        reindeer.illuminate();
    }
}
