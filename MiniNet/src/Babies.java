import java.util.*;

public class Babies extends People{
	private HashMap parents = new HashMap<String,People>();
	
	public Babies(String _firstName, String _lastName, byte _age, char _gender) {
		super(_firstName, _lastName, _age, _gender);
	}

	
}
