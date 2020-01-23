package assignment3;

import java.util.HashSet;

public class ElectionSetInput {

	public static void main(String[] args) {
		HashSet<ElectionParty> party = new HashSet<ElectionParty>();
		party.add(new ElectionParty(101,"BJP","12-1-2020", "Jaipur","Niwaru","22-1-2020"));
		party.add(new ElectionParty(181,"congress","15-1-2020", "Jaipur","vaishali nagar","27-1-2020"));
		party.add(new ElectionParty(172,"NVS","10-2-2020", "Kota","khejroli","20-2-2020"));
		party.add(new ElectionParty(101,"AAP","12-3-2020", "mount abu","abu road","22-1-2020"));
		party.add(new ElectionParty(101,"LAV","12-1-2020", "Jaipur","Niwaru","22-1-2020"));
		
//		for(ElectionParty e : party)
//		{
//			if(e.getName())
//	}
		System.out.println(party);
		
		
	}

}
