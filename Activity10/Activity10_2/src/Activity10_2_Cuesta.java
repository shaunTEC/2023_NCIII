class ChristmasTree {
    String greeting = "Merry Christmas!";
    String treeInfo = "A beautiful Christmas tree.";

    void displayBasicInfo() {
        System.out.println(greeting);
        System.out.println(treeInfo);
    }
}

class DecoratedChristmasTree extends ChristmasTree {
    String decorations = "The tree is beautifully decorated with ornaments and lights.";

    void describeDecorations() {
        System.out.println(decorations);
    }
}

public class Activity10_2_Cuesta {
    public static void main(String[] args) {
        DecoratedChristmasTree decoratedTree = new DecoratedChristmasTree();
        decoratedTree.displayBasicInfo();
        decoratedTree.describeDecorations();
    }
}
