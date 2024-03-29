package tree;

import java.util.ArrayList;

public class RightViewOfBinaryTree {
    public static int currentLevel =0;
    public static void printRightView (Node root,int nextLevel){

            if(root==null) return;
            if(currentLevel<nextLevel){
                System.out.print ("  " + root.data);
                currentLevel = nextLevel;
            }
        printRightView(root.right,nextLevel+1);
        printRightView(root.left,nextLevel+1);
        }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.left.right.right = new Node(45);
        printRightView(root,1);
    }
}
