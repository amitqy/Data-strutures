package bst;

import java.util.Objects;

public class BST {
    public Node insert(Node node, int value) {
        if (Objects.isNull(node)) {
            node = new Node(value);
            return node;
        } else if (value < node.data) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public Node delete(Node node, int value) {
        if (value < node.data) {
            return node.left = delete(node.left, value);
        } else if (value > node.data) {
            return node.right = delete(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if(node.right == null){
                return node.left;
            }
            else{
                Node temp = inOrderSuccessor(node.right);
                node.data = temp.data;
                node.right = delete(node.right,temp.data);
                return node;
            }
        }
    }

    private Node inOrderSuccessor(Node node) {

        while(node != null && node.left != null){
            node = node.left;
        }
        return node;

    }
}
