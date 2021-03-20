package newJavaIntProg;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {
	public static void main(String[] args) {

		String s[]= {"Anush","kiran","harish","Anush","harish"};
		Set<String> st=new HashSet<String>();
		for(String names:s)
		{
			if(st.add(names)==false)
			{
				System.out.println(names);
			}
		}
	}

}
