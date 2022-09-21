import org.jetbrains.annotations.NotNull;

public class BinaryTree {
    public Node root;

    public BinaryTree(){
        this.root = null;
    }
    public void addRoot(int val){
        root = new Node(val);
        size += 1;
    }
    static int size;
    public static class Node{
            int data;
            Node left;
            Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            }
        public void add(@NotNull Node node, int value){
            if (value < node.data) {
                if (node.left != null) {
                        add(node.left, value);
                } else {
                        System.out.println("  Inserted " + value + " to left of Node " + node.data);
                        size += 1;
                        node.left = new Node(value);
                }
            }
            else if (value > node.data) {
                if (node.right != null) {
                        add(node.right, value);
                } else {
                        System.out.println("  Inserted " + value + " to right of Node " + node.data);
                        size += 1;
                        node.right = new Node(value);}
            }
            else if(value == node.data){
                System.out.println("  Inserted " + value + " already in Node " );
            }
        }
        public void search(@NotNull Node node, int value){
            int deep = 0;
            if((value < node.data) && (node.left != null)){
                if(value == node.data){
                    System.out.println("----\n"+value+" in left node \nDepth: "+deep+"\n----");
                } else {
                    search(node.left,value);
                    deep += 1;
                }
            } else if((value>node.data) && (node.right != null)){
                if(value == node.data){
                    System.out.println("----\n"+value+" in right node \nDepth: "+deep+"\n----");
                } else{
                    search(node.right,value);
                    deep += 1;
                }
            }
            else if(value == node.data){
                System.out.println("----\n"+value+" in head node \nDepth: "+deep+"\n----");
            }
            else{
                System.out.println(" Not in Node ");
            }
        }

        public void clear(){
            this.data = 0;
            this.left = null;
            this.right = null;
            size = 0;
        }
    }
    public int getSize(){
        return size;
    }
}
