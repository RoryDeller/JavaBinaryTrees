public class BinaryTree
{

    private BinaryNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public void addNode(String value) {
        if (root == null) {
            root = new BinaryNode(value);
        }
        else
        {
            addNodeRecursively(root, value);
        }
    }

    public void addNodeRecursively(BinaryNode node, String value)
    {
        if (value.compareTo(node.getValue()) < 0)
        {
            if (node.getLeftChild() == null)
            {
                node.setLeftChild(new BinaryNode(value));
            }
            else
            {
                addNodeRecursively(node.getLeftChild(), value);
            }
        }
        else
        {

            /* FILL IN THIS GAP */

        }
    }
}