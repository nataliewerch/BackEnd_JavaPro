package homework16.level1.task7;

public class TreeGenericTest {
    public static void main(String[] args) {
        TreeGeneric<Integer> treeInteger = new TreeGeneric<>();
        treeInteger.add(5);
        treeInteger.add(3);
        treeInteger.add(7);
        TreeGeneric<String> treeString = new TreeGeneric<>();
        treeString.add("Hotel");
        treeString.add("Game");
        treeString.add("Glas");
        treeInteger.print();
        treeString.print();

    }
}
