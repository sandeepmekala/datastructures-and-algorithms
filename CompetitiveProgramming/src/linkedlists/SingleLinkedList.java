package linkedlists;

public class SingleLinkedList {

	private Node head;
	SingleLinkedList(){
		head = null;
	}
	
	public void insertAtEnd(int data){
		if(head == null){
			Node node = new Node();
			node.setData(data);
			head = node;
			return;
		}
		Node temp = head;
		while(temp.getNext()!= null){
			temp = temp.getNext();
		}
		
		temp.setNext(new Node(data));
		
	}
	public void insertAtBegining(int data){
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	public void print(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		
		Node temp = head;
		while(temp != null){
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
	}
	public void insertAtNthPosition(int data, int n){
		Node node  = new Node(data);
		if(n == 1){
			head = node;
			return;
		}
		Node temp = head;
		for(int i=0; i<n-2; i++){
			temp = temp.getNext();
		}
		node.setNext(temp.getNext());
		temp.setNext(node);
	}
	public void deleteAtNthPosition(int n){
		Node temp = head;
		if(n == 1){
			head = head.getNext();
			return;
		}
		for(int i=0; i<n-2; i++){
			temp = temp.getNext();
		}

		temp.setNext(temp.getNext().getNext());
	}
	public void reverse(){
		Node prev = null, current = null, next;
		current = head;
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
}