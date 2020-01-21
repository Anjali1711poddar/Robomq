package assignment2;

import java.util.Comparator;

public class SortById  implements Comparator<Book>{

		public int compare(Book b1, Book b2 ) {
		
			int k = b1.getMembers_id() - b2.getMembers_id();
			return k;
}

}
