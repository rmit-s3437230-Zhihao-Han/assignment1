
public class People {
	private String firstName;
	private String lastName;
	private byte age;
	private char gender;
	
	//Constructor
	public People(String _firstName, String _lastName, byte _age, char _gender)
	{
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.age = _age;
		this.gender = _gender;
	}
	
	//Accessors
	public String getFirstName()	{ return this.firstName; }
	public String getLastName()		{ return this.lastName; }
	public String getName()			{ return this.firstName + " " + this.lastName; }
	public byte getAge()			{ return this.age; }
	public char getGender()			{ return this.gender; }
	
	//Mutators
	public void setFirstName(String _firstName)	{ this.firstName = _firstName; }
	public void setSecondName(String _lastName)	{ this.lastName = _lastName; }
	public void setAge(byte _age)				{ this.age = _age; }
	public void setGender(char _gender)			{ this.gender = _gender; }
	
	
}
