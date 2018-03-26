import java.util.*;

public class Adult extends People implements Socializing {

    private boolean maritalStatus;
    private Adult partner;
    // private Babies children;
    private HashMap friends = new HashMap<String, People>();

    public Adult(String _firstName, String _lastName, byte _age,
            char _gender) {
        super(_firstName, _lastName, _age, _gender);
    }

    public String getMaritalStatus() {
        return this.maritalStatus == true
                ? "Married to " + this.partner.getName()
                : "Single";
    }

    public void setPartner(Adult _partner) {
        // setting partnership for both people
        this.maritalStatus = true;
        this.partner = _partner;
        _partner.maritalStatus = true;
        _partner.partner = this;
    }

    @Override
    public void setFriends(People _friend) {
        this.friends.put(_friend.getName(), _friend);
    }

}