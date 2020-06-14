import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CreateTreeFromInorderAndPreorder {
    static Node root;
  static   HashMap<String, Integer> inOrderMap;
    static class Node {
        Node left = null, right = null;
        String data;

        Node(String t) {
            data = t;
        }
    }

    // 40 10 8
    public static Node insert(Node root, String value) {
        if (root == null) {
            return new Node(value);
        }
        if (getRank(value) < getRank(root.data)) {
            root.left = insert(root.left, value);
        } else if (getRank(value) > getRank(root.data)) {
            root.right = insert(root.right, value);
        } else {
            return root;
        }
        return root;

    }

    public static int getRank(String key){
        return inOrderMap.get(key);
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

       static void createTree() {
        inOrderMap = new HashMap<>();
        inOrderMap.put("D", 0);
        inOrderMap.put("B", 1);
        inOrderMap.put("E", 2);
        inOrderMap.put("A", 3);
        inOrderMap.put("F", 4);
        inOrderMap.put("C", 5);
        String preOrder ="ABDECF";
        for(int i=0;i<preOrder.length();i++){
           root = insert(root, String.valueOf(preOrder.charAt(i)));
        }

    }

    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.println(" Enter your choice \n 1.Push \n 2.inorder \n 3 preorder. \n 4. postorder \n 0 exit \n");
            switch (br.readLine()) {
                case "1":
                    System.out.println("Enter the value ");
                    int value = Integer.parseInt(br.readLine());
                   createTree();
                    break;
                case "2":
                    inoder(root);
                    break;
                case "3":
                    preOrder(root);
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