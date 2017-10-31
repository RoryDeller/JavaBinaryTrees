public class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        /* INSERT WORDS HERE */

        tree.addNode("");
        tree.addNode("");
        tree.addNode("");
        tree.addNode("");
        tree.addNode("");
        tree.addNode("");
        tree.addNode("");
        tree.addNode("");
        tree.addNode("");

        /* - - - - - - - - - */

        System.out.println("In-Order:");
        inOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("Pre-Order:");
        preOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("Post-Order:");
        postOrderTraverse(tree.getRoot());
        System.out.println();
    }

    private static void inOrderTraverse(BinaryNode node) {
        if (node.getLeftChild() != null) inOrderTraverse(node.getLeftChild());
        System.out.println(node.getValue());
        if (node.getRightChild() != null) inOrderTraverse(node.getRightChild());
    }

    private static void preOrderTraverse(BinaryNode node) {

        /* FILL IN THIS GAP */

    }

    private static void postOrderTraverse(BinaryNode node) {

        /* FILL IN THIS GAP */

    }

}