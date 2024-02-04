class Node3 {
    int key, height;
    Node3 left, right;

    Node3(int key) {
        this.key = key;
        this.height = 1;
    }
}

public class AVLTree {

    Node3 root;

    int height(Node3 node) {
        if (node == null)
            return 0;
        return node.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node3 rightRotate(Node3 y) {
        Node3 x = y.left;
        Node3 T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node3 leftRotate(Node3 x) {
        Node3 y = x.right;
        Node3 T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(Node3 node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    Node3 insert(Node3 node, int key) {
        if (node == null)
            return (new Node3(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);


        if (balance > 1 && key < node.left.key)
            return rightRotate(node);


        if (balance < -1 && key > node.right.key)
            return leftRotate(node);


        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }


        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node3 node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();


        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Preorder traversal of constructed AVL tree is:");
        tree.preOrder(tree.root);
    }
}
