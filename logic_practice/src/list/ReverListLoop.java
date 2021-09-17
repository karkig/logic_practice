public class ReverListLoop {
    public static void main(String[] args) {
        Node list = Node.getList();
        Node.printList(list);

      Node pre= reverseList(list);
        System.out.println("");
        Node.printList(pre);

    }
    public static Node reverseList(Node list)
    {
        Node temp;
        Node pre=null;
        Node first = list;
        while (first!=null)
        {
            temp = first.next;
            first.next = pre;
            pre =first;
            first = temp;
        }
        return pre;
    }
}
