public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addRoot(10);
        var head = tree.root;
        head.add(head,1);
        head.add(head,12);
        System.out.println(tree.getSize());
        head.clear();

    }
}