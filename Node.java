/**
 * This is a Node class that allows you to create nodes of any type
 * 
 * @author Chase Hall
 * @version 8/31/23 CS215_Assignement_0.3_COH Fall 2023
 * 
 */

public class Node<T> {
	T data;// Will be used to set the nodes data
	Node<T> nextNode;// Will be used to create another node

	/**
	 * Wont construct node with anything in it
	 */

	public Node() {
		nextNode = null;

	}// end constructor

	/**
	 * Allows you to set the data
	 * 
	 * @param data will be used to set the data
	 */

	public void setData(T data) {
		this.data = data;
	}// end setData

	/**
	 * Will return the node
	 * @returns the node
	 */

	public Node<T> getNode() {
		return this;
	}//end getNode
	/**
	 * will set the next node of the list
	 * @param nextNode while be used to set the value of the next node
	 */

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}//end setNextNOde

}//end class
