package com.nt.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Vector;

public class ListTest {


	public static void main(String[] args) {
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
	/*	PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("joseph");  
		System.out.println("head:"+queue.peek());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		*/
		
		/*
		  HashSet<String> hs=new HashSet<String>();  
		  hs.add("Ravi");  
		  hs.add("Vijay");  
		  hs.add("Ajay"); 
		
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonoo");  
		  al2.add("Hanumat");  
		  al.addAll(al2);//adding second list in first list 
		  al.contains(al2);
		 // al.removeAll(al);
		  Iterator itr=hs.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   hs.remove(hs);*/
		  }  
		 }  
		
		
		
					
		
		   
		 
	
	
	
	/*Vector v=new Vector();

	System.out.println(v.capacity());
  v.add("A");
  v.add("B");
  v.add("C");
  v.add("D");
  v.add("E");
  System.out.println(v);
  System.out.println(v.firstElement());
  System.out.println(v.lastElement());
  System.out.println(v.elementAt(3));
  System.out.println(v.remove(2));
  v.add("B");
  System.out.println(v);
  v.add(new Integer(10));
  System.out.println(v);
  System.out.println(v.isEmpty());
  System.out.println(v.add("Y"));
  v.removeAll(v);
  System.out.println(v);
}*/


