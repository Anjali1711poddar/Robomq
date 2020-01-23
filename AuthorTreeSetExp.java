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
		
		public int hashCode()
		{
			return AuthorName.hashCode();
		}
		
		public boolean equals(Object o)
		{
			boolean flag=false;
			if(o instanceof AuthorTreeSetExp)
			{
				AuthorTreeSetExp p=(AuthorTreeSetExp)o;
				if(p.AuthorName.equals(this.AuthorName))
					flag=true;
			}
			return flag;
		}
		
		@Override
		public String toString() {
			return "\nAuthorTreeSetExp [AuthorId=" + AuthorId + ", AuthorName=" + AuthorName + ", AuthorAddress="
					+ AuthorAddress + "]";
		}
		public static AuthorTreeSetExp get(String i) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}
