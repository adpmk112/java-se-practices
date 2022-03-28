package javaSE.kmp.linkedList;

interface LinkedList<T>
{
	void add(T data);
	void delete(T data);
	void removeNode();

	boolean isNextNotNull();
	int size();
	
	T currentData();
}
class SinglyLinkedList<T> implements LinkedList<T>
{
	private Node head;
	private int size;
	
	private int count;
	private Node currentNode,prevNode;
	private T data;
	
	private class Node
	{
		private T data;
		private Node next; 
		
		private Node(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	@Override
	public void add(T data)
	{
		size++; 
		Node node = new Node(data);	 
		Node n  = head;
		if (n==null)
		{
			head = node;
		}
		else {
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	@Override
	public int size()
	{
		return size;
	}

	@Override
	public boolean isNextNotNull() {
		// TODO Auto-generated method stub
		if(count == 0) {
			currentNode = head;
			prevNode = null;
		}
		if(prevNode != null){
			while(prevNode.next!=currentNode){
				prevNode = prevNode.next;
			}
		}
		boolean hasNode = false;
		if(currentNode!=null)
		{ 
			data = (T) currentNode.data;
			currentNode = currentNode.next;
			if(prevNode == null){
				prevNode = head;
			}
			hasNode = true;
			count++;
		}
		else 
		{
			count = 0;
		}
		return  hasNode;
	}
	
	
	@Override
	public T currentData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		Node cur = head;
		Node prev = null;
		if(cur == null) return;
		if(cur.data == data) {
		head = cur.next;
		size--;
		return;
		}
		while(cur!=null && cur.data!=data) {
			prev = cur;
			cur = cur.next;
		}
		if(cur==null)return;
		if(cur.data == data) {
			prev.next = cur.next;
			size--;
		}
	}

	@Override
	public void removeNode() {
		if(prevNode == head && prevNode.data == data){
			head = currentNode;
		}
		if(prevNode.next.data == data){
			 prevNode.next = currentNode;
		}
	}
	
	/*	public void printList()
	{
	    Node n = head;
		while (head !=null)
		{
		//Person prn = (Person) head.data;
		//	System.out.println(prn.getName()+"-->"+prn.getAge()); 
			
			System.out.println(head.data);
			head = head.next;
		}
	} */
}

class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class ListIterator<T>{
	
	private LinkedList<T> linkedList;
	
	public ListIterator(LinkedList<T> linkedList) {
		this.linkedList = linkedList;
	}   
	
	public boolean hasNext() {
		return linkedList.isNextNotNull();
	}
	
	public T data() {  
		return linkedList.currentData();
	}

	public void remove(){
		linkedList.removeNode();
	}

}

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		nonPrimatives();
	}
	public static void primatives()
	{
		LinkedList<Integer>numbers = new SinglyLinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

	/*	System.out.println("Before deletion :"+numbers.size());
		numbers.delete(3);
		System.out.println("After deletion :"+numbers.size()); */
		
		ListIterator<Integer>itr = new ListIterator<>(numbers);  
		while(itr.hasNext()) {
			if(itr.data() == 5)
			{
				itr.remove();
			}
		}
		while(itr.hasNext()) {
			System.out.println(itr.data());
		}
	}
	public 	static void nonPrimatives()
	{
		LinkedList<Person>people = new SinglyLinkedList<>();
		people.add(new Person("Mg Mg",26));
		people.add(new Person("Zaw Zaw",21));
		people.add(new Person("Nyi Nyi",18));
		people.add(new Person("Mg Mg",30));
		
		ListIterator<Person>itr = new ListIterator<>(people);
		while(itr.hasNext()) {
			Person prn = itr.data();
			if(prn.getName().equals("Mg Mg") && prn.getAge()==26)
			{
				itr.remove();
			}
		}
		while(itr.hasNext())
		{
			Person prn = itr.data();
			System.out.println(prn.getName()+"-->"+prn.getAge());
		}
	
	/*	SinglyLinkedList<Integer> slList = new SinglyLinkedList<>();
		slList.add(1);
		slList.add(2);
		slList.add(3);
		
		slList.printList();
		System.out.println("size --> "+slList.size()); */
		
/*	Node head = new Node(1);
		
		Node second = new Node(2);
		head.next = second;
		
		Node third = new Node(3);
		second.next = third;
		//head.next.next = third;
		
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data); */
	}
}
