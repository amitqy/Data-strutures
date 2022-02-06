package bst;

import java.util.Objects;

public class BST {
    public Node insert(Node node,int value){
        if(Objects.isNull(node)){
            node = new Node(value);
            return node;
        }
        return node;
    }
}
