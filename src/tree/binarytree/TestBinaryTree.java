package tree.binarytree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();


        binaryTree.getHeightOfTree();
        binaryTree.search(1);
        binaryTree.insert(1);
        binaryTree.getHeightOfTree();
        binaryTree.search(1);
       // binaryTree.delete(1);
        binaryTree.insert(2);
        binaryTree.getHeightOfTree();
        binaryTree.insert(3);
        binaryTree.getHeightOfTree();
        binaryTree.insert(4);
        binaryTree.getHeightOfTree();
        binaryTree.insert(5);
        binaryTree.getHeightOfTree();
        binaryTree.getDeepestNode();
        binaryTree.search(50);
        binaryTree.levelOrderTraversal();
        binaryTree.delete(5);
        binaryTree.delete(2);

        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.getHeightOfTree();

        binaryTree.levelOrderTraversal();
        binaryTree.preOrderTraversal();
        binaryTree.inOrderTraversal();
        binaryTree.postOrderTraversal();

    }
}
