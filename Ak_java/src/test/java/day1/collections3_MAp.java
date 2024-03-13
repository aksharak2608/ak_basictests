package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class collections3_MAp {
	public static void main(String args[])
	{
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "ak");
		hm.put(3, "arsh");
		hm.put(8,"selenium");
		
		
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{ 
			
			int a=itr.next();
			System.out.println(a);
			//int key=(int)a;
		
			System.out.println(hm.get(a));
			
		}
		
		
		
	}

}
