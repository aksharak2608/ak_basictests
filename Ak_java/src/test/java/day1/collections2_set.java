package day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class collections2_set {
	public static void main(String args[])
	{
		HashSet<Integer> h1= new HashSet<Integer>();
		ArrayList<Integer> a2= new ArrayList<Integer>();
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(434);
		a1.add(345);
		a1.add(42);
		a1.add(2, 34335);
		System.out.println(a1);
		h1.addAll(a1);
		h1.add(4343453);
		System.out.println("set values are" +h1);
		for(int a:h1)
		{
			//System.out.println(a);
		}
		h1.remove(0);
		
		System.out.println(h1.size()+" is the size of the set");
		
		Iterator<Integer> itr=h1.iterator();
		while(itr.hasNext())
		{
		
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
