import java.util.ArrayDeque;

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        /* INSERT WORDS HERE */

        tree.addNode("Pear", false);
        tree.addNode("Grape", false);
        tree.addNode("Pineapple", false);
        tree.addNode("Lemon", false);
        tree.addNode("Grapefruit", false);
        tree.addNode("Lime", false);
        tree.addNode("Apple", false);
        tree.addNode("Strawberry", false);
        tree.addNode("Raspberry", false);
        tree.addNode("Melon", false);
        tree.addNode("Kiwi", false);
        tree.addNode("Blueberry", false);
        tree.addNode("Blackcurrant", false);
        tree.addNode("Banana", false);

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

        System.out.println("Stack-Printed:");
        stackPrint(tree.getRoot());
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

    public static void stackPrint(BinaryNode root)
    {
        ArrayDeque<BinaryNode> stack = new ArrayDeque<>();
        BinaryNode node = root;

        while (node != null) {
            stack.push(node);
            node = node.getLeftChild();
        }

        while (stack.size() > 0)
        {

            node = stack.pop();
            String line = "";
            for (BinaryNode parent = node.getParent();
                 parent != null;
                 parent = parent.getParent())
            {
                line += "----";
            }
            line += "-> " + node.getValue();

            System.out.println(line);

            if (node.getRightChild() != null)
            {
                node = node.getRightChild();
                while (node != null)
                {
                    stack.push(node);
                    node = node.getLeftChild();
                }
            }

        }



    }



}