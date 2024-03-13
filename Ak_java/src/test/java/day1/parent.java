package day1;

public class parent extends child{

	int a1;
	public void test1()
	{
		System.out.println("parent1 class");
	}
	public void test1(int a)
	{
		System.out.println("parent1 class");
	}
	public void test1(char a)
	{
		System.out.println("parent1 class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		parent obj= new parent();
		obj.test();
		
	}

}
