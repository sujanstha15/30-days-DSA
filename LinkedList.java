
public class LinkedList {
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    //inserting node at the end of linked list
    
    //Function to insert a node at the end of the linked list
    Node insertAtEnd(Node head, int x){
        //create a new node with the given value
        Node newNode = new Node(x);

        //edge case- if the linked list is empty, the new node becomes the head
        if(head==null){
            return newNode;
        }

        //Traverse to the last node
        Node current = head;
        while(current.next!=null){
            current= current.next;
        }
        //point the last node's next to the new node
        current.next = newNode;

        //return head;
        return head;
    }
}
