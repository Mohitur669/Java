import com.sun.source.tree.Tree;

import java.util.Scanner;

public class TreeNodeUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        TreeNode<Integer> root = takeInput(s);
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println("The number of nodes is: ");
        System.out.println(numNodes(root));
        System.out.println(largest(root));
        printAtK(root, 2);
        preOrder(root);
        System.out.println();

//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//
//        System.out.println(root);
    }

    // taking tree input from the user - recursively
    public static TreeNode<Integer> takeInput(Scanner s) {
        int n;
        System.out.println("Enter next node data: ");
        n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    // printing the tree taken from the user - recursively
    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    // taking input level wise - iteration method - more comfortable for the user
    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData = s.nextInt();
        QueuesUsingLL<TreeNode<Integer>> pendingNodes = new QueuesUsingLL<>(2);
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter num of children of " + frontNode.data);
                int numChildren = s.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
                // shouldn't come here
                return null;
            }
        }
        return root;
    }

    // printing the tree taken from the user - iterative method - more comfortable for the user
//    public static void printLevelWise(TreeNode<Integer> root) {
//
//    }

    // count number of nodes in a tree
    public static int numNodes(TreeNode<Integer> root) {
        // this is a edge case - not a base case, base case is automatically handled by for loop in this case
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    // returning the nodes with largest data
    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largest(root.children.get(i));
            if (childLargest > ans) {
                ans = childLargest;
            }
        }
        return ans;
    }

    // depth of a node
    /* This will print all the nodes data on a single depth */
    public static void printAtK(TreeNode<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAtK(root.children.get(i), k - 1);
        }
    }
    
    // preorder Traversal
    public static void preOrder(TreeNode<Integer> root){
        if (root == null){
            return;
        }
        System.out.println(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            preOrder(root.children.get(i));
        }
    }
}