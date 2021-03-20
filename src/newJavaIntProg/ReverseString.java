package newJavaIntProg;

import java.util.Scanner;

public class ReverseString {
public static void revStr()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter any name :");
	String name=s.nextLine();
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
		
	}
	System.out.println(rev);
}
public static void main(String[] args)
{
	revStr();
}
}
