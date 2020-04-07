package com.nt.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Book Implements Comparable<Book> {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
 
public int compareTo(Book b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  

public class CollectionBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Book> set=new TreeSet<Book>();
		Book b1=new Book(101,"java","nataraj","jan",2);
		Book b2=new Book(102,".net","nare","nan",6);
		Book b3=new Book(103,"Oracle","nag","man",3);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(Book b:set)
			System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
	}

}
