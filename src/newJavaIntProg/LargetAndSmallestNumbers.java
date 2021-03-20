package newJavaIntProg;

public class LargetAndSmallestNumbers {

	public static void main(String[] args) {
		int num[]= {14,18,21,-2,67,42};
		int largest=num[0];
		int smallest=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("Largest number is :"+largest);
		System.out.println("Smallest number is :"+smallest);

	}

}
