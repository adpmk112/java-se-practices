package javaSE.kmp.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackVsQueue {
	public static void main(String[] args) {
		// Stack (Last in firstout) using like undo
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Peek --> " +stack.peek());
		System.out.println("Stack Size --> "+stack.size());
		System.out.println("Pop =  Before pop = "+stack.pop()+" ->  After pop ,Peek --> "+stack.peek());
		System.out.println("Search 1 --> "+stack.search(1)+" //Count backward");
		
		stack.remove(1); // count like normal index
		System.out.println("Final stack -->" +stack);
		
		System.out.println("------------------------------");
		
		Queue<String>queue = new PriorityQueue<>(); //First in firstout
		queue.add("A");
		queue.add("B");
		
		System.out.println("Queue size --> "+queue.size());
		System.out.println("queue.peek() --> "+queue.peek());
		
		queue.remove("A");
		
		System.out.println("After remove, Queue size --> "+queue.size());
		System.out.println("queue.peek() --> "+queue.peek());
		
		//search (there is no method to search for Queue)
		
		boolean found = false;
		for(String out:queue)
		{
			if(out.equals("A"))
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Found!");
		}
		else
		{
			System.out.println("Not found!");
		}
	}
}
