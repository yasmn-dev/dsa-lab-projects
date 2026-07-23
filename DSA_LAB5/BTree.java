public class BTree {
    Node root;

    public BTree(){
        root = null;
    }

    Node newNode(int data){
        Node n = new Node(data);
        System.out.println(data + " ağaca eklendi ");
        return n;
    }
    Node insert (Node root,int data){
        if(root != null){
            if(data < root.data)
                root.left = insert (root.left, data);
            else
                root.right = insert(root.right, data);
        }else
            root = newNode(data);

        return root;
    }
}

