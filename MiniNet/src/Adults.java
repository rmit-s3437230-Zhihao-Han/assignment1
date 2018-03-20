import java.util.*;

public class Adults extends People{
	
	private boolean maritalStatus;
	private Adults partner;
	//private Babies children;
	private People[] friends = new People[50];
	
	
	public Adults(String _firstName, String _lastName, byte _age, char _gender){
		super(_firstName, _lastName, _age, _gender);
	}

	public String getMaritalStatus() {
		return this.maritalStatus == true ? "Married to " + this.partner.getName() : "Single";
	}
	
	public void setPartner(Adults _partner)
	{
		this.maritalStatus = true;
		this.partner = _partner;
		
		_partner.maritalStatus = true;
		_partner.partner = this;
	}
	
	
}
