package newJavaIntProg;

public class LargestNumberInAnArray {
	public static void main(String[] args) {
int num[]= {10,-12,17,18,4};
int largest=num[0];
for(int i=1;i<num.length;i++)
{
	if(num[i]>largest)
	{
		largest=num[i];
	}
	
}
System.out.println(largest);
}
}