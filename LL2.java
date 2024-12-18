public class LL2 {
    /*
     
    My initial code to find the number of linked list in a linked list

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count=0;
        Node temp = head;
        if(head==null){
            return 0;
        }
        
        while(head!=null){
            
            if(temp.next!=null){
                temp = temp.next;
                count++;
            }
        }
        return count;
    }
}

     //Here is the correct code, there are some logical error. our implementation has a logical error. 
     The code initializes temp to head but does not properly iterate through the linked list.
      Instead, the while loop checks head != null and increments temp incorrectly. Here's the corrected implementation:
  */

  class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count = 0; // Initialize count to 0
        Node temp = head; // Start with the head node
        
        // Traverse the list until reaching the end
        while (temp != null) {
            count++; // Increment count for each node
            temp = temp.next; // Move to the next node
        }
        
        return count; // Return the total count
    }
}


}
