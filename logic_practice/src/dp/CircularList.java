public class CircularList {
    public static void main(String[] args) throws Exception {
        Test.NodeList slow = Test.createCircularList();
        Test.NodeList temp = slow;
        System.out.println("===========" +temp+"  slow "+ slow);
        while(temp!=null && temp.next!=slow)
        {
            temp = temp.next;
            System.out.println("==================== middle is "+temp.data);

        }
    }
}
