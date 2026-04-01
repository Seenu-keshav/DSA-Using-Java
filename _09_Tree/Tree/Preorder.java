
import java.util.*;

//preorder node ka data uske bad left ka data given rhta and uske bad right ka data
// 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
//        1
//     2    3
//  4   5   null  6
// traversal -->recursion form me preorder postorder  inorder
// level order traversal
public class Preorder {

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

    static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);

        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;

            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        public static void levelOrder(Node root) {
            // check the root is present or not if not then return
            if (root == null) {
                return;
            }
             // add the root to the queue
            Queue<Node> q = new LinkedList();
            q.add(root);
            q.add(null);
             // check the queue is empty or not 
            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        tree.preorder(root);
        System.out.println("--------------------");
        tree.inorder(root);
        System.out.println("--------------------");
        tree.postorder(root);
        tree.levelOrder( root); 
    }

}
