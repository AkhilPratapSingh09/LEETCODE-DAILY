import org.w3c.dom.Node;

public class intersecoftwosortedll {
    
    class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node head = null;
        Node prev = head;
   
        while(head1 != null && head2 != null){
            
            if(head1.data < head2.data) head1 = head1.next;
            else if(head2.data < head1.data) head2 = head2.next;
            else if(head1.data == head2.data) {
                Node cur = new Node(head1.data);
                
                if(head == null) head =prev= cur;
                else {
                    prev.next = cur;
                    prev = cur;
                }
                head1 = head1.next;
                head2 = head2.next;
                
            }
        }
        return head;
    }
}


    
}
