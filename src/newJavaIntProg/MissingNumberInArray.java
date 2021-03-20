package newJavaIntProg;

public class MissingNumberInArray {
public static void main(String[] args)
{
	int num[]= {49,50,51,53,54};
	int sum=0;
	for(int i=0;i<num.length;i++)
	{
		sum=sum+num[i];
	}
	System.out.println(sum);
	int sum1=0;
	for(int j=49;j<=54;j++)
	{
		sum1=sum1+j;
	}
	System.out.println(sum1);
	System.out.println("Missing number in an array is :"+(sum1-sum));
}
}
