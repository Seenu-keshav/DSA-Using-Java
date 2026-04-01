
public class Height_Of_Binary_Tree {

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;

    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int lcount = count(root.left);
        int rcount = count(root.right);
        int treecount = lcount + rcount + 1;

        return treecount;
    }

    public static int sum(Node root) {

        if (root == null) {
            return 0;
        }

        int lsum = sum(root.left);
        int rsum = sum(root.right);

        int totalsum = lsum + rsum + root.data;

        return totalsum;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDia = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDia = diameter(root.right);
        int rightHeigth = height(root.right);
        int selfDia = leftHeight + rightHeigth + 1;

        return Math.max(selfDia, Math.max(leftDia, rightDia));

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.print(sum(root));
        System.out.println(diameter(root));
    }
}
