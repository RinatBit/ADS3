
public class MyBSTTest {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer, String> tree = new MyBinarySearchTree<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");
        tree.put(1, "one");
        tree.put(4, "four");

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
        System.out.println("Size: " + tree.size());
    }
}
