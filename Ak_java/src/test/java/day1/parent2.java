package day1;

public class parent2 extends parent{

	int a2;
	public void test1()
	{
		System.out.println("parent2 class");
		super.test1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		parent2 obj= new parent2();
		obj.test1();
		
	child obj1= new child();
	obj1.test();

	//parent2 obj2= new child();
	//invalid scenario
	//child obj3= new parent2();
		
		
	}

}
