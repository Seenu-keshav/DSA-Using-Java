
public class Diameter_Of_Tree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class buildTree {

        static int idx = -1;

        public static Node buildTree(int arr[]) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }
    }

    static class Info {

        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {

        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        buildTree tree = new buildTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root).diam);
    }

}
