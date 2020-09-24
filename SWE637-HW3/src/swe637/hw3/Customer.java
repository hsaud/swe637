package swe637.hw3;

public class Customer {
	// create Rank class
	// Rank rank;

	Rank rank;
	String name;
	
	public Customer(String name, Rank rank) {
		super();
		this.rank = rank;
		this.name = name;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
