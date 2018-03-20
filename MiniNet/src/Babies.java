import java.util.*;

public class Babies extends People{
	private Map<String,People> parents = new HashMap<>();
	
	public Babies(String _firstName, String _lastName, byte _age, char _gender) {
		super(_firstName, _lastName, _age, _gender);
	}

	
}
