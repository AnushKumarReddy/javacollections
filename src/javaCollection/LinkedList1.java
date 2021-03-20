package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("anush");
		ll.add("harish");
		ll.add("kiran");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		ArrayList temp=new ArrayList();
		temp.addAll(ll);
		Collections.sort(temp);
		System.out.println(temp);
		Collections.shuffle(temp);
		System.out.println(temp);
		
		
		
	}

}
