package assignment2;

import java.util.*;

public class BookList {
	
	public static void main(String[] args)
	{
		ArrayList<Book> books = new ArrayList<Book>();
		
		
		books.add(new Book(101,"why sky is blue","mr. Arjun",1020,4));
		books.add(new Book(102,"blue whale","mrs. swati patel",2010,5));
		books.add(new Book(103,"black hole","shushant",6754,7));
		books.add(new Book(104,"yes..True ","surya",9872,8));
		books.add(new Book(105,"satya","mahesh" ,3241,6));
		
		System.out.println(books);
		
		
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			Book b = (Book)obj;
			System.out.println(b.getName());
		}
		
		
		System.out.println("enter ur choice for sorting");
		Scanner scan = new Scanner(System.in);
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("\nsort by publisher id");
			
			SortByPublisherId s = new SortByPublisherId();
			books.sort(s);
			System.out.println(books);
			break;
			
		case 2:
         System.out.println("\nsort by name");
			
			SortById i = new SortById();
			books.sort(i);
			System.out.println(books);
			break;
		
		case 3:
			 System.out.println("\nsort by Author");
				
				SortByAuthor a = new SortByAuthor();
				books.sort(a);
				System.out.println(books);
				break;
		case 4:
			 System.out.println("\nsort by name");
				
				SortByBookName n = new SortByBookName();
				books.sort(n);
				System.out.println(books);
				break;
	
				
				
		}
		
	}
	
     
}
