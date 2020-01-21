package assignment2;

import java.util.Comparator;

public class SortByPublisherId implements Comparator<Book>{

		public int compare(Book b1, Book b2 ) {
		
			int k = b1.getPublisher() - b2.getPublisher();
			return k;
}
}