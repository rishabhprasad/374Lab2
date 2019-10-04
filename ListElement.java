//		NAME: RISHABH PRASAD		S.I.D.: 200389227		ENSE374 - LAB ASSIGNMENT 2: PART 1

public class ListElement {
	
	//
	public ListElement next;
	public ListElement head;
	private int data;
	
	
	//Constructor class to set node elements to null for an empty node
	public ListElement()
	{
		
		this.head = null;
		this.next = null;
		this.data = 0;
		
	}
	
	//Set data in a node
	public void setData(int data)
	{
		this.data = data;
	}

	
	//Get data from a node
	public int getData()
	{
		return this.data;
	}

	//Add an element into a linked list (NOT WORKING)
	public void addElement(ListElement le)
	{
		
		
		//If no elements in the list and head is null, attach head to the new node
		if (head == null)
		{
			head = le;
		}
		else	//Add the new node to the front of the list
		{
			ListElement temp;
			
			temp = le;			//set a temp pointer for the new node;
			temp.next = head;	//Connect the new node to head
			head = temp;		//Point head to the new node
			
		}
		
	}
	
	//Find an element in the list
	public ListElement getElement(int index)
	{
		
		ListElement temp = head;		//Set a temp pointer to head
		
		//While the temp pointer doesnt reach a NULL pointer and the data does not match the correct index
		while(temp.next != null && temp.getData() != index)
		{
			
			temp = temp.next;	//Set temp to the node which was found
			
		}
		
		if (temp = null)		//If temp reached the end of the list and the element was not found
		{
			System.out.print("Item Not Found.");	//Output that the element doesnt exist in the list
		}
		else
		{
			return temp;		//Return the element
		}
		
	}
	
	public ListElement deleteElement(int index)
	{
		
		
		//Create 2 pointers
		ListElement temp = head.next;	//Set temp to the node after head
		
		ListElement prev = head;		//Set prev to head
		
		while(temp.next != null && temp.getData() != index)
		{
			//Keep looping until temp is at the node to be deleted
			temp = temp.next;
			prev = temp;
		}
		
		//Link the previous node to the node after temp (the node to be deleted)
		prev = temp.next;		
		
		
	}
	
	
	//Print the list
	public void printLinkedListHead()
	{
		
		ListElement temp = head;
		
		while (temp.next != null)	//While the temp pointer doesn't reach the end of the list, keep looping
		{
			
			System.out.print(temp.getData() + " ");	//Output the data currently at temp
			
			temp = temp.next;
		
		}			
		
		
	}

}