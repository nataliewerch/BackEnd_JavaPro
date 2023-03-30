package homework16.level1.task7;

import java.util.Stack;

public class TreeGeneric <T extends Comparable<T>>{
    private Node root;

    public TreeGeneric() {
    }

    public void print(){
        if (root == null){
            return;
        }
        Stack<TreeGeneric.Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){
            TreeGeneric.Node node = stack.pop();
            System.out.println(node.val + " ");

            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null){
                stack.add(node.left);
            }
        }

    }
    public boolean add(T value) {
        Node currentNode = new Node();
        currentNode.val = value;
        if (root == null) {
            root = currentNode;
            return true;
        } else {
            Node comparingNode = root;
            while (comparingNode != null) {
                if (comparingNode.val.compareTo(value) < 0) {
                    if (comparingNode.right == null) {
                        comparingNode.right = currentNode;
                        return true;
                    }
                    comparingNode = comparingNode.right;
                } else if (comparingNode.val.compareTo(value) > 0) {
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
    public class Node{
        private T val;
        private Node left;
        private Node right;
    }

}


