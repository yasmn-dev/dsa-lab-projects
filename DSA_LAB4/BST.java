public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(int v) {
        if (root == null) {
            root = new Node(v);
            return;
        }
        Node cur = root;
        while (true) {
            if (v < cur.value) {
                if (cur.left == null) {
                    cur.left = new Node(v);
                    return;
                }
                cur = cur.left;
            } else {
                if (cur.right == null) {
                    cur.right = new Node(v);
                    return;
                }
                cur = cur.right;
            }
        }
    }

    public boolean search(int v) {
        Node cur = root;
        while (cur != null) {
            if (v == cur.value) {
                return true;
            } else {
                cur = (v < cur.value) ? cur.left : cur.right;
            }
        } return false;
    }

    public Node findMin(Node node) {
        Node cur = node;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    public Node deleteRec(Node node, int key) {
        if (node == null)
            return null;

        if (key < node.value) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.value) {
            node.right = deleteRec(node.right, key);
        } else {
            // Case 1: no child
            if (node.left == null && node.right == null)
                return null;
            // Case 2: one child
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;
            // Case 3: two children
            Node succ = findMin(node.right); // inorder successor
            node.value = succ.value; // copy successor value
            node.right = deleteRec(node.right, succ.value); // delete successor
        }
        return node;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    public void printInOrder() {
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(Node node) {
        if (node == null)
            return;
        printInOrderRec(node.left);
        System.out.print(node.value + " ");
        printInOrderRec(node.right);
    }
}
