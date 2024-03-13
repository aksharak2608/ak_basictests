package day1;

public class encap {
	private int a,b;
	
	
	private int sum(int a,int b)
	{
		return a+b;
	}
	
	public  void setter(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getter()
	{
		return sum(a,b);
		
	}

}
