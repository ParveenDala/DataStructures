package tree.bst;

import java.util.LinkedList;
import java.util.Queue;

/******
 * Parveen Dala
 * Binary Search Tree Using Linked List, Data Structure
 */
public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Empty Tree");
        } else {
            System.out.print("Level Order Traversal: ");
            levelOrderTraversal(root);
            System.out.println();
        }
    }

    private void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.value + " ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }

    }

    public void inOrderTraversal() {
        if (root == null) {
            System.out.println("Empty Tree");
        } else {
            System.out.print("In Order Traversal: ");
            inOrderTraversal(root);
            System.out.println();
        }
    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal() {
        if (root == null) {
            System.out.println("Empty Tree");
        } else {
            System.out.print("Pre Order Traversal: ");
            preOrderTraversal(root);
            System.out.println();
        }
    }

    private void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal() {
        if (root == null) {
            System.out.println("Empty Tree");
        } else {
            System.out.print("Post Order Traversal: ");
            postOrderTraversal(root);
            System.out.println();
        }
    }

    private void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    public void insert(int value) {
        System.out.println("Insert: " + value);
        root = insert(root, value);
        levelOrderTraversal();
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            if (value <= root.value) {
                root.left = insert(root.left, value);
            } else {
                root.right = insert(root.right, value);
            }
        }
        return root;
    }

    public void delete(int value) {
        System.out.println("Delete: " + value);
        root = delete(root, value);
        inOrderTraversal();
    }

    private Node delete(Node root, int value) {
        if (root != null) {
            if (value == root.value) {
                if (root.left == null && root.right == null) {
                    root = null;
                } else if (root.left == null) {
                    root = root.right;
                } else if (root.right == null) {
                    root = root.left;
                } else {
                    Node smallestNode = getSmallestNode(root.right);
                    root.value = smallestNode.value;
                    root.right = delete(root.right, smallestNode.value);
                    return root;
                }
            } else if (value < root.value) {
                root.left = delete(root.left, value);
            } else {
                root.right = delete(root.right, value);
            }
        }
        return root;
    }

    private Node getSmallestNode(Node root) {
        if (root != null) {
            while (root.left != null) {
                root = root.left;
            }
        }
        return root;
    }

    public void search(int value) {
        System.out.print("Search: " + value + "  > ");
        search(root, value);
    }

    private void search(Node root, int value) {
        if (root == null) {
            System.out.println("Not Found " + value);
        } else if (value == root.value) {
            System.out.println("Found " + value);
        } else if (value < root.value) {
            search(root.left, value);
        } else
            search(root.right, value);
    }


}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}
