public class FindMiddleOfList {
    public static void main(String[] args) throws Exception {
        Test.NodeList slow = Test.createList();
        Test.NodeList fast=slow;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
        }
        System.out.println("==================== middle is "+slow.data);
    }
}