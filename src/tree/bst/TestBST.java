package tree.bst;

public class TestBST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.levelOrderTraversal();
        bst.search(20);
        bst.insert(5);
        bst.search(5);
        bst.insert(4);
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);
        bst.insert(6);
        bst.insert(7);
        bst.insert(8);
        bst.inOrderTraversal();
        bst.search(1);
        bst.search(10);
        bst.search(15);
        bst.inOrderTraversal();
        bst.delete(51);
        bst.delete(6);
        bst.delete(8);
        bst.delete(1);
        bst.delete(2);
        bst.delete(3);
        bst.delete(4);
        bst.delete(5);
    }
}
