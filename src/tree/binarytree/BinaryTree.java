package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;


/******
 * Parveen Dala
 * Binary Tree Using Linked List, Data Structure
 */
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Empty tree");
        } else {
            levelOrderTraversal(root);
            System.out.println();
        }
    }

    public void preOrderTraversal() {
        if (root == null) {
            System.out.println("Empty tree");
        } else {
            preOrderTraversal(root);
            System.out.println();
        }
    }

    public void inOrderTraversal() {
        if (root == null) {
            System.out.println("Empty tree");
        } else {
            inOrderTraversal(root);
            System.out.println();
        }
    }

    public void postOrderTraversal() {
        if (root == null) {
            System.out.println("Empty tree");
        } else {
            postOrderTraversal(root);
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

    private void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    private void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    public void search(int value) {
        if (root == null) {
            System.out.println("Not Found " + value);
        } else {
            search(root, value);
        }
    }

    private void search(Node root, int value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current.value == value) {
                System.out.println("Found " + value);
                return;
            }
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        System.out.println("Not Found " + value);
    }

    public void insert(int value) {
        System.out.println("Insert " + value);
        Node node = new Node(value);
        if (root == null) {
            root = node;
        } else {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node current = queue.remove();
                if (current.left == null) {
                    current.left = node;
                    break;
                } else if (current.right == null) {
                    current.right = node;
                    break;
                } else {
                    queue.add(current.left);
                    queue.add(current.right);
                }
            }
        }
        levelOrderTraversal();
    }

    public void delete(int value) {
        delete(root, value);
    }

    public void delete(Node root, int value) {
        if (root == null) {
            System.out.print("Unable to delete, Empty tree");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current.value == value) {
                System.out.print("Node found");
                Node deepestNode = getDeepestNode();
                current.value = deepestNode.value;
                deleteDeepestNode();
            } else {
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
        levelOrderTraversal();
    }

    private void deleteDeepestNode() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node previousNode = null;
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current.left == null) {
                if (previousNode == null)
                    root = null;
                else
                    previousNode.right = null;
                break;
            } else if (current.right == null) {
                current.left = null;
                break;
            }
            queue.add(current.left);
            queue.add(current.right);
            previousNode = current;
        }
    }

    public void getHeightOfTree() {
        if (root == null) {
            System.out.println("Tree Height = 0");
            return;
        }

        Node current = root;
        int count = 0;
        while (current.left != null) {
            count++;
            current = current.left;
        }
        System.out.println("Tree Height = " + count);

    }

    public Node getDeepestNode() {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node node = root;
        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        System.out.println(" Deepest Node  " + node.value);
        return node;
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}
