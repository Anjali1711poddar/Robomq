package com.robomq.pojo;

public class Order {

	private int id;
	private String name ,description;
	private String Scharge;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getScharge() {
		return Scharge;
	}
	public void setScharge(String scharge) {
		Scharge = scharge;
	}
	@Override
	public String toString() {
		return "\nOrder [id=" + id + ", name=" + name + ", description=" + description + ", Scharge=" + Scharge + "]";
	}
	
	
	

}
