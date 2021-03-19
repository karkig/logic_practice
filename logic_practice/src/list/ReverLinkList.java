public class ReverLinkList {
    public static void main(String[] args) throws Exception {
        Test.NodeList list = Test.createList();

      Test.printList(revers(list,null));
    }

    public static Test.NodeList revers(Test.NodeList list, Test.NodeList reversList)
    {
        if(list==null)
        {
            return reversList;
        }else {

            Test t = new Test();
            Test.NodeList nodeList = t. new NodeList(list.data);
             nodeList.next = reversList;
             reversList = nodeList;
             return revers(list.next, reversList);

        }
    }
}