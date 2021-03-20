package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAgent {
	public static void main(String[] args) {
		Agent a=new Agent("Anush", 505, "Hyd");
		Agent a1=new Agent("Chintu", 101, "Atp");
		Agent a2=new Agent("java", 0101, "sun");
		List al=new ArrayList();
		al.add(a);
		al.add(a1);
		al.add(a2);
	Iterator<Agent> it = al.iterator();// getting the iterartor
	while(it.hasNext()) //checking if ietrator is having elements
	{
		Agent aa=it.next();
		System.out.println(aa.name+" "+aa.id+" "+aa.city);
	}
	}

}
