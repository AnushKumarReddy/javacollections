package newJavaIntProg;

public class AmstrongNumber {
	public static void isAmstrong(int num)
	{
		int r;
		int cube=0;
		int temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(temp==cube)
		{
			System.out.println("number is amStrong");
		}
		else
		{
			System.out.println("numnber is not Amstrong");
		}
	}
	public static void main(String[] args) {
		isAmstrong(152);
	}
}
