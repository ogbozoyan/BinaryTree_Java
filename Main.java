public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addRoot("h");
        var head = tree.root;

         head.add(head,"hello");
        head.search(head,"hello");
        head.add(head,"");
        head.add(head,"1");
        head.add(head,"                                        ");
        head.search(head,"d");
    }
}