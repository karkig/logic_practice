import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindNthItemFromLast {
    public static void main(String[] args) throws Exception {
        Test.NodeList head = Test.createList();
        System.out.println("Enter the position");
        int n= Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count=1;
        Test.NodeList fast=head;
        while(head!=null && count <=n)
        {
            count++;
            head = head.next;
        }
        while (head!=null && fast!=null)
        {
            head = head.next;
            fast =fast.next;

        }
       System.out.println("==================== the item "+n+" is"+ fast.data );
    }
}
