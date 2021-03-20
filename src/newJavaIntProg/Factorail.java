package newJavaIntProg;

public class Factorail {
public static int facto(int num)
{
	int fact=1;
	if(num==0)
	{
		return 1;
	}
	/*for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	return fact;*/
	else
	{
		return(num*facto(num-1));
	}

}
public static void main(String[] args) {
	System.out.println(facto(5));
}
}
