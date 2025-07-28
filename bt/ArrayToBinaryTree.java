package bt;

import java.util.ArrayList;

public class ArrayToBinaryTree {

    public BinaryTree arrayToBinarySearchTree(ArrayList<Integer> arr)
    {
        if(arr.size()==0)
            return new BinaryTree();
        BinaryTree t = new BinaryTree();
        TreeNode root = new TreeNode();
        root.setValue(arr.get(0));
        t.setRoot(root);
        for(int i=1; i<arr.size(); i++)
        {
            TreeNode current = t.getRoot();
            TreeNode parent = current;
            TreeNode newNode = new TreeNode();
            newNode.setValue(arr.get(i));

            //Identify correct location to insert
            while (current != null) {
                parent = current;
                if (arr.get(i) <= current.getValue()) {
                    current = current.getLeft();
                } else {
                    current = current.getRight();
                }
            }
            //Current is null, insert as left or right child of parent
           if(arr.get(i) <= parent.getValue())
               parent.setLeft(newNode);
           else parent.setRight(newNode);
        }
        return t;
    }

    public static TreeNode buildTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return buildTreeRecursive(arr, 0);
    }

    private static TreeNode buildTreeRecursive(int[] arr, int index) {
        if (index >= arr.length || arr[index] == -1) { // Assuming -1 indicates a null node
            return null;
        }

        TreeNode node = new TreeNode();
        node.setValue(arr[index]);
        node.setLeft(buildTreeRecursive(arr, 2 * index + 1));
        node.setRight(buildTreeRecursive(arr, 2 * index + 2));
        return node;
    }
    public static void main(String[] args){

    }
}
