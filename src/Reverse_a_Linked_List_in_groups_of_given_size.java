

/*
* Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should be considered as a group and must be reversed (See Example 2 for clarification).
Example 1:
Input:
LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output: 4 2 2 1 8 7 6 5
Explanation:
The first 4 elements 1,2,2,4 are reversed first
and then the next 4 elements 5,6,7,8. Hence, the
resultant linked list is 4->2->2->1->8->7->6->5.

*/
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
public class Reverse_a_Linked_List_in_groups_of_given_size {
    public static Node reverse(Node node, int k)
    {
        Node prev=null;
        Node curr=node;
        int i=0;
        Node nextbegin=null;
        Node initial=node;
        while(i<k){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            nextbegin=prev.next;
            i++;
        }
        Node nextcurr=nextbegin;
        Node prev1=null;
        while(curr!=null){
            Node temp=nextcurr.next;
            nextcurr.next=prev1;
            prev1=curr;
            curr=temp;
        }
        // joining the node
        Node pointer=null;
        while(prev!=null){
            pointer=prev.next;
        }
        prev.next=pointer;
        return prev;
    }

}
