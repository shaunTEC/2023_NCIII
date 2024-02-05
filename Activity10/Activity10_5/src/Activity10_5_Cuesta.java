interface Decorating {
    void decorate();
}

interface Illuminating {
    void illuminate();
}

class ChristmasEntity {
    String greeting = "Merry Christmas!";
    String basicDetails = "A festive entity celebrating Christmas.";

    void displayGreeting() {
        System.out.println(greeting);
    }

    void displayBasicDetails() {
        System.out.println(basicDetails);
    }
}

class ChristmasTree extends ChristmasEntity implements Decorating, Illuminating {
    @Override
    public void decorate() {
        System.out.println("The Christmas tree is being decorated with ornaments and lights.");
    }

    @Override
    public void illuminate() {
        System.out.println("The Christmas tree is illuminated with festive lights!");
    }
}

public class Activity10_5_Cuesta {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree();
        System.out.println("Christmas Tree:");
        christmasTree.displayGreeting();
        christmasTree.displayBasicDetails();
        christmasTree.decorate();
        christmasTree.illuminate();
    }
}
