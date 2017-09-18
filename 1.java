//1. Reverses a single list.  The Node of this single list as the following:
class Node{
	Node next;
	int value;
 
	Node(int value){
		this.value = value;
	}
}
// Your resolution 
// Assume the linked list is not in a cycle.
public Node reverse(Node head){
	if(head == null || head.next = =null) return head;
	
	Node current = head;
	Node next = null;
	Node prev = null;

	while(current != null){
		next = current.next; // Save the next node
		current.next = prev; // Reverse the pointer
		prev = current;	// Update the previous node
		current = next; // Update the current node
	}
	head = prev;
	return head;
}

public void displayLinkedList(Node head){
	Node current = head;
	while(current != null){
		System.out.print(current.value + " ");
	}
}
// Time complexity: O(N)
// Space complexity: O(1)
// JUnit test cases
/*
1. Node head = null; // Return: null
2. Node head = new Node(1); //Return 1
3. Node head = new Node(1); // Return 2 1
   head.next = new Node(2);
*/