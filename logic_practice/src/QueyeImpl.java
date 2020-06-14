import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueyeImpl {
    static Node first;
    static Node last;

    static class Node {
        Node next;
        int data;
        Node(int t){
            data =t ;
        }
    }

    public static void insert() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value ");
        Node tem = new Node(Integer.parseInt(br.readLine()));

        if(first==null){
            last=tem;
            first=tem;
        }else {
            last.next=tem;
            last=tem;
        }
    }

    public static void delete() {
        if(first==null){
            System.out.println("under flow");
        }
        System.out.println("delete item is "+first.data);
        first = first.next;
    }

    public static void peek() {
        System.out.println("first item is "+first.data);
        System.out.println("last item is "+last.data);

    }

    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.println(" Enter your choice \n 1.insert \n 2.delete \n 3 peek. \n 0 exit \n");
            switch (br.readLine()) {
                case "1":
                    insert();
                    break;
                case "2":
                    delete();
                    break;
                case "3":
                    peek();
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
