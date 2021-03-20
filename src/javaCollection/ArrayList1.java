package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		
		List al=new ArrayList();
		al.add("anush");
		al.add("Harish");
		al.add("Kiran");
		al.add("anush");
		al.add(123);
		al.remove(3);
		al.add(3,"sai");
		al.set(3,"chintu");
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.get(3));
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*for( Object listing:al)
		{
			String string = listing.toString();
			System.out.println(string);
		}*/
		
		
	}

}
