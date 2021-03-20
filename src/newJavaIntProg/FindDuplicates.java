package newJavaIntProg;

public class FindDuplicates {

	public static void main(String[] args) {
		String s[]= {"Anush","kiran","harish","Anush","harish"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println(s[i]);
				}
			}
		}

	}

}
