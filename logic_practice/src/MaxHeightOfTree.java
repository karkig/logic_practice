import java.io.BufferedReader;
import java.io.InputStreamReader;

//Sum and Product of minimum and maximum element of Binary Search Tree
public class MaxHeightOfTree {
    static Node root;

    static class Node {
        Node left = null, right = null;
        int data;

        Node(int t) {
            data = t;
        }
    }


    public static Node insert(Node root, int value) throws Exception {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        } else {
            return root;
        }
        return root;

    }

    public static int  findHeight(Node root) {
        if(root==null){
          return 0;
        }else {
            int l =findHeight(root.left);
            int r =findHeight(root.right);
            if(l>r){
                return (l+1);
            }else {
                return (r+1);
            }
        }
    }



    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.print(" Enter your choice \n 1.Push \n 2.height \n 0 exit == ");
            switch (br.readLine()) {
                case "1":
                    System.out.println("Enter the value ");
                    int value = Integer.parseInt(br.readLine());
                    root = insert(root, value);
                    break;
                case "2":
                    int m =findHeight(root);
                    System.out.println("height is"+m);

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
     40  10 8  20 70 60 5,4,3,2,1,

        40
      /     \
     10       70
    /  \     /
   8   20  60


inorder   8 10  20  40 60 70
preordr   40 10 8 20 70 60
psotoder  8 20 10 60 70 40

 */