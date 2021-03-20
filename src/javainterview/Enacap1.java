package javainterview;

public class Enacap1 {
	private String name;
	private String address;
	public String getName()
	{
		return name;
	}
	public String getAdd()
	{
		return address;
	}
public void setName(String name)
{
	this.name=name;
}
public void setAdd(String address)
{
	this.address=address;
	
}
public static void main(String[] args) {
	Enacap1 e=new Enacap1();
	e.setAdd("kadiri");
	e.setName("anush");
	System.out.println("name is :"+e.getName()+" and address is :"+e.getAdd());
}
}
