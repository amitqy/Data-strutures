package bt;

import java.util.Scanner;

public class BinaryTree {

    public Node takeInput(Scanner s) {

        int rootData;
        System.out.println("Enter root data - ");

        rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        Node root = new Node(rootData);
        System.out.println("enter data for left node of :" + root.data);
        root.left = takeInput(s);
        System.out.println("enter data for right node of :" + root.data);
        root.right = takeInput(s);
        return root;
    }

}
