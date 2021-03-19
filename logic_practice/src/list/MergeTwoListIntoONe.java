public class MergeTwoListIntoONe {
    public static void main(String[] args) throws Exception {
        Test.NodeList list1 = Test.createList();
        Test.NodeList list2 = Test.createList();
        Test.NodeList list3 = null;
        Test.NodeList temp = null;
        while (list1 != null || list2 != null) {
            if (list1 != null) {
                Test t = new Test();
                Test.NodeList nodeList = t.new NodeList(list1.data);

                if (list3 == null) {
                    list3 = nodeList;
                    temp = nodeList;

                } else {
                    temp.next = nodeList;
                    temp = nodeList;
                }

                list1 = list1.next;
            }
            if (list2 != null) {
                Test t = new Test();
                Test.NodeList nodeList = t.new NodeList(list2.data);
                temp.next = nodeList;
                temp = nodeList;

                list2 = list2.next;
            }
        }

        Test.printList(list3);
    }
}
