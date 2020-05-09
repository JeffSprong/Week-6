
public class Card {
	
	private int value;
	private String name;
	
	public Card (int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String describe() {
		
		switch (value) {
		 case 11:
			 return "Jack of " + name;
			 
		 case 12:
			 return "Queen of " + name;
			
		 case 13:
			 return "King of " + name;
			
		 case 14:
			 return "Ace of " + name;
		
		 default:
			 return value + " of " + name;
	}
	}
	
	
}
