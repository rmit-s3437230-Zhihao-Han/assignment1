
public abstract class People {
	private String name;
	private byte age;
	private char gender;
	
	public People(String _name, byte _age, char _gender)
	{
		this.name = _name;
		this.age = _age;
		this.gender = _gender;
	}
	//Accessors
	public abstract String getName();
	public abstract byte getAge();
	public abstract char getGender();
	
	//Mutators
	public abstract void setName(String _name);
	public abstract void setAge(byte _age);
	public abstract void setGender(char _gender);
	
	
}
