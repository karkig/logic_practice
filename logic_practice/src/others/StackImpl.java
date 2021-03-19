import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class StackImpl {
    static Node first;

    static class Node {
        Node next;
        int data;
        Node(int t){
            data =t ;
        }
    }

    public static void push(Node first) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value ");

        Node tem = new Node(Integer.parseInt(br.readLine()));
        tem.next = first;
        first = tem;

    }

    public static void pop(Node first) {

    }

    public static void peek(Node first) {

    }

    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.println(" Enter your choice \n 1.Push \n 2.pop \n 3 peek. \n 0 exit \n");
            switch (br.readLine()) {
                case "1":
                    push(first);
                    break;
                case "2":
                    pop(first);
                    break;
                case "3":
                    peek(first);
                    break;
                case "0":
                    hasTrue=false;
                    break;
                default:
                    System.out.println("Enter the correct choice.");

            }
        }
    }

}
