/**
 * This is the LinkedLIst class it will hold all the Nodes you have and create
 * list of any type
 * 
 * @author Chase
 * @version 8/31/23 CS215_Assignement_0.3_COH Fall 2023
 *
 * @param <T>Generic Type that is used so you can create a List of any type
 */
public class LinkedList<T> {

	Node<T> head;// Will be used to start the list
	int length;// will be used to find the length of the list
	Node<T> tail;// will end the list

	/**
	 * Will be used to create a empty list
	 */

	public LinkedList() {
		head = null;
		length = 0;
		tail = head;
	}// end constructor

	/**
	 * will the determine if the list is empty
	 * 
	 * @return true or false depending on what if its empty
	 */

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}// end isEmpty

	/**
	 * will output the top of the list
	 * 
	 * @return the top of the list
	 */

	public Node<T> getList() {
		return head;
	}// end getList

	/**
	 * will add a node to the list
	 * 
	 * @param aNode what you want the node to be
	 */

	public void addNode(Node<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail = head;
			return;
		}
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;

	}// end addNode
}// end class