import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    NodeList head;
    public  class NodeList {
        int data;
        NodeList next;
        NodeList(int d){
            data = d;
        }
    }

    public static void main(String[] args) throws IOException {
        createList();

    }
    public static NodeList createList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String d =bufferedReader.readLine();

        Test test = new Test();
        NodeList first=null;
        while(d!=null&& !d.equals(""))
        {

            NodeList node = test.new NodeList(Integer.parseInt(d));
            node.next=null;
            if(test.head==null) {
                test.head = node;
                first=node;
            }else {
                first.next = node;
                first = node;

            }
            first.next=test.head;
            d= bufferedReader.readLine();
        }
        System.out.println("------------------ listed creatd with elements");
        printList(test.head);

        return test.head;
    }
    public static void printList(NodeList nodeList)
    {
        while(nodeList!=null){
            System.out.println(""+ nodeList.data);
            nodeList = nodeList.next;
        }
    }
    public static NodeList  createCircularList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String d =bufferedReader.readLine();

        Test test = new Test();
        NodeList temp=null;
        while(d!=null&& !d.equals(""))
        {
            NodeList node = test.new NodeList(Integer.parseInt(d));
            node.next=null;
            if(test.head==null) {
                test.head = node;
                temp=node;
            }else {
                temp.next = node;
                temp = node;
            }
            temp.next = test.head;
            d= bufferedReader.readLine();
        }
        System.out.println("------------------ listed creatd with elements");
       // printList(test.head);

        System.out.println("------------------------ end-------------");
        return test.head;
    }
}
