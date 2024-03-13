package day1;

public class useintf implements intf1,intf2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useintf obj = new useintf();
		obj.abc();
		obj.abc1(12);
		obj.abc1(23);
		obj.abc12(34);
		

	}

	public int abc() {
		// TODO Auto-generated method stub
		
		System.out.println("method with out values");
		return 0;
	}

	public int abc1(int a) {
		// TODO Auto-generated method stub
		System.out.println("method with  values");
		return 0;
		
	}

	public int abc1() {
		// TODO Auto-generated method stub
		System.out.println("method with out values from intf2");
		return 0;
	}

	public int abc12(int a) {
		// TODO Auto-generated method stub
		System.out.println("method with  values intf2");
		return 0;
	}

}
