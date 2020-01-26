package dek.algorithm.tree_and_graph;

public class TreeTraversal {

    Node root;

    TreeTraversal {
        root = null;
    }

    public void inOrderTraversal(Node root) {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.val + " ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if(root == null)
            return;

        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.val + " ");
    }

    public void preOrderTraversal(Node root) {
        if(root == null)
            return;

        System.out.println(root.val + " ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

}
