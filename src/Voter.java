public class Voter{
	

	private String IdNumber;
	private String name;

	public Voter(String IdNumber, String name){

	this.IdNumber = IdNumber;
	this.name = name;
	}

	public String getName(){

	return this.name;

	}

	public String getId(){

		return this.IdNumber;
	}
}

