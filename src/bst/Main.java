package bst;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        Node root = bst.insert(null,77);
        bst.insert(root,12);
        bst.insert(root,84);
        bst.insert(root,789);
        bst.insert(root,1);

        System.out.println("root: " + root.data);
        System.out.println("root.left: " + root.left.data);
        System.out.println("root.right: " + root.right.data);
        System.out.println("root.right.right: " + root.right.right.data);
        System.out.println("root.left.left: " + root.left.left.data);
    }
}
