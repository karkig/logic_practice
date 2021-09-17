/*
A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457
 */
public class Add1ToListNumbers {
    public static void main(String[] args) {
        Node first = Node.getList();
        Node.printList(first);
        int carry = add1(first);
        if(carry==1)
        {
            Node n = new Node(1);
            n.next =first;
            first = n;
        }
        Node.printList(first);
    }

    public static int add1(Node n)
    {
        if(n==null)
        {
            return 1;
        }
        else {
            int carry = add1(n.next);
            int t = n.data+carry;
            n.data = t%10;
            return t/10;
        }
    }
}
