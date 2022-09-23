import org.jetbrains.annotations.NotNull;

public class BinaryTree<T extends Comparable<T>> {
    public Node root;

    public BinaryTree(){
        this.root = null;
    }
    public void addRoot(T val){
        root = new Node(val);
        size += 1;
    }
    static int size;
    public class Node{
            T data;
            Node left;
            Node right;
        public Node(T data){
            this.data = data;
            this.left = null;
            this.right = null;
            }
        public void add(@NotNull Node node, T value){
           try {
               if ((value.compareTo(node.data)) < 0) {
                   if (node.left != null) {
                       add(node.left, value);
                   } else {
                       System.out.println("  Inserted " + "'"+value +"'"+ " to left " + node.data);
                       size += 1;
                       node.left = new Node(value);
                   }
               } else if ((value.compareTo(node.data)) > 0) {
                   if (node.right != null) {
                       add(node.right, value);
                   } else {
                       System.out.println("  Inserted " + "'"+value +"'"+  " to right  " + node.data);
                       size += 1;
                       node.right = new Node(value);
                   }
               } else if ((value.compareTo(node.data)) == (0)) {
                   System.out.println("  Inserted " + value + " already in BinaryTree ");
               }
           }
           catch(ClassCastException e){
               System.out.println("Different type of elements \n" +
                       "You should use same type which is root data element type;\n" +
                       "Root element: " + root.data);
           }
        }
        public void search(@NotNull Node node, T value){
            int deep = 0;
            try{
                if(((value.compareTo(node.data)) < 0) && (node.left != null)){
                if((value.compareTo(node.data)) == (0)){
                    System.out.println("----\n"+"'"+value +"'"+" in left  \nDeep: "+deep+"\n----");
                } else {
                    search(node.left,value);
                    deep += 1;
                }
            } else if(((value.compareTo(node.data)) > 0) && (node.right != null)){
                if((value.compareTo(node.data)) == (0)){
                    System.out.println("----\n"+"'"+value +"'"+" in right  \nDeep: "+deep+"\n----");
                } else{
                    search(node.right,value);
                    deep += 1;
                }
            }
            else if((value.compareTo(node.data)) == (0)){
                System.out.println("----\n"+"'"+value +"'"+" in head  \nDeep: "+deep+"\n----");
            }
            else{
                System.out.println(" Not found in BinaryTree ");
            }
            } catch (ClassCastException e) {
                System.out.println("Different type of elements \n" +
                        "You should use same type which is root data element type;\n" +
                        "Root element: " + root.data);
            }
        }


        public void clear(){
            this.data = null;
            this.left = null;
            this.right = null;
            size = 0;
        }
    }
    public int getSize(){
        return size;
    }
}
