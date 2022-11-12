public class printLevelWise {
    /*
    public static void printLevelWise(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
        TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
        q.enqueue(root);
        q.enqueue(nullNode);
        System.out.println(root.data);
        while(q.size()!=1){
            TreeNode<Integer> temp = null;
            try{
                temp = q.dequeue();

            } catch (QueueEmptyException e){

            }
            if(temp==nullNode){
                q.enqueue(nullNode);
                System.out.println();
                continue;
            }
            for(int i = 0; i<temp.children.size();++i){
                System.out.print(temp.children.get(i).data+" ");
                q.enqueue(temp.children.get(i));
            }
        }

    }*/
}