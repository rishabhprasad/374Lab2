//		NAME: RISHABH PRASAD		S.I.D.: 200389227		ENSE374 - LAB ASSIGNMENT 2: PART 1

public class Object {

	public static void main (String[] args)
	{
		//Create a new linked list
		ListElement ll = new ListElement();
		
		//First node
		ListElement le = new ListElement();
		le.setData(5);
		ll.addElement(le);
		
		//Second node
		ListElement le1 = new ListElement();
		le1.setData(10);
		ll.addElement(le);
		
		//Third Node
		ListElement le2 = new ListElement();
		le2.setData(15)
		ll.addElement(le2)
		
		//Print List
		ll.printLinkedListHead();
		
		//Delete 10 from the linked list
		ll.deleteElement(10)
		
		//Print List
		ll.printLinkedListHead();
		

	}

	

}