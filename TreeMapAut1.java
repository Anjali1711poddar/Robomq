package assignment3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapAut1 {

	
	 public static void main(String args[]){  
		 
		 
		 TreeMap<String,AuthorTreeSetExp> bookDetails = new TreeMap<String,AuthorTreeSetExp>();    
		 bookDetails.put("sky is pink" ,new AuthorTreeSetExp(101,"Arjun pareek","Jaipur"));
		 bookDetails.put("fault in stars" ,new AuthorTreeSetExp(104,"suresh mishra","Jodhpur"));
		 bookDetails.put("mind is powerful" ,new AuthorTreeSetExp(106,"mohan lal","Ajmer"));
		  bookDetails.put("true Dreams" ,new AuthorTreeSetExp(101,"Arjun pareek","Jaipur"));
	
		  
			Set<String>keys = bookDetails.keySet();
			
		  for(String m : keys)  
	      {  
	          System.out.println(m+"\nwritten by" + bookDetails.get(m).getAuthorName() + " : " + bookDetails.get(m).getAuthorAddress());      
	       
		 
	      }
		  
		  System.out.println("Authors who have written more than one book are:");
		  
			HashSet<String> authorset=new HashSet<String>();
			
			for(String i:keys)
			{
				AuthorTreeSetExp a=AuthorTreeSetExp.get(i);
				
				if(authorset.add(a.getAuthorName())==false)
				{
					System.out.println("Author with ID: "+a.getAuthorId()+" and name "+a.getAuthorName()+" living at "+a.getAuthorAddress()+" has written more than one book");
				}
			}
			
}
}
