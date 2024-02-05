interface Decorating {
    void decorate();
}

interface Illuminating {
    void illuminate();
}

class ChristmasTree implements Decorating, Illuminating {
    @Override
    public void decorate() {
        System.out.println("The Christmas tree is being decorated with ornaments and lights.");
    }

    @Override
    public void illuminate() {
        System.out.println("The Christmas tree is illuminated with festive lights!");
    }
}

public class Activity10_4_Cuesta {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.decorate();
        christmasTree.illuminate();
    }
}
