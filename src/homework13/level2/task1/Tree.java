package homework13.level2.task1;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
    }

    public void print(){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.val + " ");

            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null){
                stack.add(node.left);
            }
        }

    }
    public boolean add(int value) {
        Node currentNode = new Node();
        currentNode.val = value;
        if (root == null) {
            root = currentNode;
            return true;
        } else {
            Node comparingNode = root;
            while (comparingNode != null) {
                if (comparingNode.val < value) {
                    if (comparingNode.right == null) {
                        comparingNode.right = currentNode;
                        return true;
                    }
                    comparingNode = comparingNode.right;
                } else if (comparingNode.val > value) {
                    if (comparingNode.left == null) {
                        comparingNode.left = currentNode;
                        return true;
                    }
                    comparingNode = comparingNode.left;
                } else {
                    return false;
                }
            }
        }
        return false;
    }






    public static class Node{
       private int val;
        Node left;
        Node right;
    }

}
