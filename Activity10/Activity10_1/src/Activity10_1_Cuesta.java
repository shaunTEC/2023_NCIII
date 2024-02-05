class ChristmasEntity {
    String greeting = "Merry Christmas!";
}
class ChristmasTree extends ChristmasEntity {
    String treeInfo = "A beautiful Christmas tree.";

    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTree();
        System.out.println(tree.greeting);
        System.out.println(tree.treeInfo);
    }
}
