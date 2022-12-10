import java.util.Scanner;

public class postOrderTraversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInputLevelWise();
    }

    public static void postOrder(TreeNode<Integer> root) {
        //todo: post order tree traversal
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData = s.nextInt();
        QueuesUsingLL2<TreeNode<Integer>> pendingNodes = new QueuesUsingLL2<>(2);
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
            } catch (QueueEmptyException2 e) {
                // shouldn't come here
                return null;
            }
        }
        return root;
    }
}