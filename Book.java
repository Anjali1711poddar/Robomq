package assignment2;

public class Book {
	private int members_id;
	private String name;
	private String author;
	private  int publisherId;
	private int quantity;
	
	
	
	public Book(int members_id,String name,String author,int publisherId,int quantity) {
		super();
		this.members_id = members_id;
		this.name = name;
		this.author = author;
		this.publisherId = publisherId;
		this.quantity = quantity;
		
		
	}
	public int getMembers_id() {
		return members_id;
	}
	public void setMembers_id(int members_id) {
		this.members_id = members_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublisher() {
		return publisherId;
	}
	public void setPublisher(int publisherId) {
		this.publisherId = publisherId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "\nBook [members_id=" + members_id + ", name=" + name + ", author=" + author + ", publisherId="
				+ publisherId + ", quantity=" + quantity + "]";
	}

	
	
}
