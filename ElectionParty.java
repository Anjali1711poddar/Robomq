package assignment3;

public class ElectionParty {
	
	private int ElectionId;
	private String name;
	private String electionDate;
	private String district;
    private String constituency;
    private String countingDate;
    
    
    
    
	public ElectionParty(int electionId, String name, String electionDate, String district, String constituency,
			String countingDate) {
		super();
		ElectionId = electionId;
		this.name = name;
		this.electionDate = electionDate;
		this.district = district;
		this.constituency = constituency;
		this.countingDate = countingDate;
	}
	
	
//	public ElectionParty(int i, String string, String string2, String string3, String string4) {
//		// TODO Auto-generated constructor stub
//	}

	
	
	public int hashCode()
	{
	 return name.hashCode();
	}

	public boolean equals(Object o)
	{
		System.out.println("in equals()...");
		boolean flag= false;
		
		if( o instanceof ElectionParty )
		{
			ElectionParty e = (ElectionParty)o;
			if(e.name == this.name)
				flag = true;
			
		}
		return flag;
	}

	public int getElectionId() {
		return ElectionId;
	}
	public void setElectionId(int electionId) {
		ElectionId = electionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectionDate() {
		return electionDate;
	}
	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getCountingDate() {
		return countingDate;
	}
	public void setCountingDate(String countingDate) {
		this.countingDate = countingDate;
	}


	@Override
	public String toString() {
		return "\nElectionParty [ElectionId=" + ElectionId + ", name=" + name + ", electionDate=" + electionDate
				+ ", district=" + district + ", constituency=" + constituency + ", countingDate=" + countingDate + "]";
	}
	
	
    
    
}
