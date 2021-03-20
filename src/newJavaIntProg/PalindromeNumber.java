package newJavaIntProg;

public class PalindromeNumber {
	public static void isPalindrome(int num)
	{
	int rev=0;
	int temp;
	temp=num;
	while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	if(temp==rev)
	{
		System.out.println("number is palindrome");
	}
	else
		System.out.println("number is not palimdrome");
	}
public static void main(String[] args) {
	isPalindrome(142);
}
}
