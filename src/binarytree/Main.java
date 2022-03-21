package binarytree;


// 3
//

import java.util.Objects;

class BinaryTree {
    int data;
    BinaryTree left, right;

    public BinaryTree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public BinaryTree insert(int data, BinaryTree root){
        if(root == null){
           return null;
        }
        else{
            if(root.left == null){
               root.left = new BinaryTree(data);
               return root.left;
            }
            else{
               root.right= new BinaryTree(data);
               return root.right;
            }

        }
    }

}

public class Main {
    public static void main(String[] args) {
     BinaryTree root = new BinaryTree(12);
     root.insert(3,root);

    }
}
