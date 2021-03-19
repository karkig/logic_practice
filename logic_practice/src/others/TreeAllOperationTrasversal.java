import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
We have discussed BST search and insert operations. In this post, delete operation is discussed. When we delete a node, three possibilities arise.
1) Node to be deleted is leaf: Simply remove from the tree.

              50                            50
           /     \         delete(20)      /   \
          30      70       --------->    30     70
         /  \    /  \                     \    /  \
       20   40  60   80                   40  60   80
2) Node to be deleted has only one child: Copy the child to the node and delete the child

              50                            50
           /     \         delete(30)      /   \
          30      70       --------->    40     70
            \    /  \                          /  \
            40  60   80                       60   80
3) Node to be deleted has two children: Find inorder successor of the node. Copy contents of the inorder successor to the node and delete the inorder successor. Note that inorder predecessor can also be used.





              50                            60
           /     \         delete(50)      /   \
          40      70       --------->    40    70
                 /  \                            \
                60   80                           80
The important thing to note is, inorder successor is needed only when right child is not empty. In this particular case, inorder successor can be obtained by finding the minimum value in right child of the node.
 */
public class TreeAllOperationTrasversal {
    static Node root;

    static class Node {
        Node left = null, right = null;
        int data;

        Node(int t) {
            data = t;
        }
    }

    // 40 10 8
    public static Node insert(Node root, int value) throws Exception {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
            System.out.println("========" + root.left.data);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        } else {
            return root;
        }
        return root;

    }

    public static void inoder(Node root) {
        if (root != null) {
            inoder(root.left);
            System.out.print(" " + root.data);
            inoder(root.right);
        }
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.data);
        }

    }

    public static int preOrderMin(Node node) {
        int min = node.data;
        while ((node.left != null)) {
            if (node.left.data < min) {
                min = node.left.data;
            }
            node = node.left;
        }
        return min;
    }

    public static Node recursiveDelete(Node node, int data) {
        if (node == null) {
            return null;
        } else if (data < node.data) {
            node.left = recursiveDelete(node.left, data);
        } else if (data > node.data) {
            node.right = recursiveDelete(node.right, data);
        } else {

            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                node.data = preOrderMin(node.right);
                node.right = recursiveDelete(node.right, node.data);
            }
        }
        return node;
    }

    public static void deleteNode(Node node) throws IOException {
        System.out.println("Enter the value ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());
        recursiveDelete(node, value);
    }

    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.println(" Enter your choice \n 1.Push \n 2.inorder \n 3 preorder. \n 4. postorder \n 5. delete \n 0 exit \n");
            switch (br.readLine()) {
                case "1":
                    System.out.println("Enter the value ");
                    int value = Integer.parseInt(br.readLine());
                    root = insert(root, value);
                    break;
                case "2":
                    inoder(root);
                    break;
                case "3":
                    preOrder(root);
                    break;
                case "4":
                    postOrder(root);
                    break;
                case "5":
                    deleteNode(root);
                    break;
                case "0":
                    hasTrue = false;
                    break;
                default:
                    System.out.println("Enter the correct choice.");

            }
        }
    }

}
/*
     40  10 8  20 70 60

        40
      /     \
     10       70
    /  \     /
   8   20  60


inorder   8 10  20  40 60 70
preordr   40 10 8 20 70 60
psotoder  8 20 10 60 70 40

 */