package assignment3;

public class AuthorTreeSetExp {
	
	private  int AuthorId;
    private  String AuthorName;
          private String AuthorAddress;
         
          
          
public AuthorTreeSetExp(int authorId, String authorName, String authorAddress) {
			super();
			AuthorId = authorId;
			AuthorName = authorName;
			AuthorAddress = authorAddress;
		}
		public int getAuthorId() {
			return AuthorId;
		}
		public void setAuthorId(int authorId) {
			AuthorId = authorId;
		}
		public String getAuthorName() {
			return AuthorName;
		}
		public void setAuthorName(String authorName) {
			AuthorName = authorName;
		}
		public String getAuthorAddress() {
			return AuthorAddress;
		}
		public void setAuthorAddress(String authorAddress) {
			AuthorAddress = authorAddress;
		}
		@Override
		public String toString() {
			return "\nAuthorTreeSetExp [AuthorId=" + AuthorId + ", AuthorName=" + AuthorName + ", AuthorAddress="
					+ AuthorAddress + "]";
		}
		
		
}
