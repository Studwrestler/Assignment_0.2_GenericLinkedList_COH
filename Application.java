/**
 * This class allows you to create a LinkedList of nodes of any type
 * @author Chase Hall
 * @version 8/31/23
 * CS215_Assignement_0.3_COH
 * Fall 2023
 * 
 */

public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
/**
 * Main loop of application
 * @param args arguments of main method
 */
	public static void main(String[] args) {
		LinkedList<Integer> intList=new LinkedList<Integer>();
		
		Node<Integer> intNode=new Node<Integer>();
		intNode.setData(1);
		intList.addNode(intNode);
		intNode = new Node<Integer>();
		intNode.setData(2);
		intList.addNode(intNode);
		
		Node<Integer> tempnode=intList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		LinkedList<String> strList= new LinkedList<String>();
		
		Node<String> strNode=new Node<String>();
		strNode.setData("Im Chase Hall");
		strList.addNode(strNode);
		strNode = new Node<String>();
		strNode.setData("Im majoring in Computer Engineering");
		strList.addNode(strNode);
		
		Node<String> strtempnode=strList.getList();
		do 
		{
			System.out.println(strtempnode.data);
			strtempnode=strtempnode.nextNode;
		} while (strtempnode!=null);

	}//end main

}//end class
