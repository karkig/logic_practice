public class DeleteNodeAt_O_Complexity {
    public static void main(String[] args) throws Exception {
        Test.NodeList list = Test.createList();
        
        /*

            Node.data = node.next.data;
            node.next = node.next.next;
            this can delete the node at O(n) complexcity,  but it will not work for last element.


         */
        Test.printList(list);

    }


}