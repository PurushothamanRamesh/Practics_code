public class Remove_duplicates_from_an_unsorted_linked_list {
    public Node removeDuplicates(Node head)
    {
        Node start=head;
        if(head==null ) return null;
        while(start!=null){
            Node temp=start;
            Node temp1=start.next;
            while(temp1!=null){
                if(start.data==temp1.data){
                    temp.next=temp1.next;
                }else{
                    temp=temp.next;
                    temp1=temp1.next;

                }

            }
            start=start.next;
        }
        return start;
    }
}
