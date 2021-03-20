package javaCollection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pqueue {
	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(30);
		//q.add("anush");
		System.out.println(q);
		Iterator it=q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		q.offer(50);
		System.out.println(q);
		q.remove(30);
		System.out.println(q);
		q.remove(30);
		System.out.println(q);
		q.remove(30);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
	}

}
