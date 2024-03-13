package day1;

import java.util.ArrayList;
import java.util.Iterator;

public class collections1 {
	public static void main(String args[])
	{
		int [] arr;
		int arr1[]=new int [5];
		int arr2[]= {2,3,4,56,4};
		for(int i=0;i<arr2.length;i++)
		{
			//System.out.println(arr2[i]);
		}
		
		for(int a:arr2)
		{
			System.out.println(a);
		}
		String[] str1= {"sdfsf","Sdfsdf","sdfdsf"};
		for(String a:str1)
		{
		System.out.println(a);
		}
		ArrayList<Integer> a2= new ArrayList<Integer>();
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(434);
		a1.add(345);
		a1.add(42);
		a1.add(2, 34335);
		System.out.println(a1);
		for(int a:a1)
		{
			//System.out.println(a);
		}
		a1.remove(0);
		a2.addAll(a1);
		a1.add(4341);
		a1.add(3451);
		a1.add(421);
		a1.add(2, 343235);
		System.out.println(a1.size()+" is the size of the array");
		a1.removeAll(a2);
		System.out.println(a1);
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext())
		{
		
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
