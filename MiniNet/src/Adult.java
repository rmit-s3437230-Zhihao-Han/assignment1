import java.util.*;

public class Adult extends People {

    // Attributes
    private Adult partner;
    private String status;
    private Map<String, People> children;
    private Map<String, Adult> friends;

    // Constructor
    public Adult(String _firstName, String _lastName, int _age,
            String _gender) {
        super(_firstName, _lastName, _age, _gender);
        this.status = "";
        this.partner = null;
    }

    // Accessos
    public Map getFriendsMap()
    {
        return this.friends;
    }

    // Mutators
    public void setStatus(String _status) {
        this.status = _status;
    }

    public boolean setPartner(Adult _partner) {
        // Specification does not allow divorce and get married 
        // to another person.
        // ==> check and allow to add partner
        //     ONLY if the attribute has not been set.
        if (this.partner == null)
        {
            this.partner = _partner;
            return true;
        } else {
            //CANNOT add partner for a married person!
            return false;
        }
    }
    
    public boolean addFriend(Adult newFriend)
    {
        if ( !alreadyExisted(newFriend.getName(), friends) )
        {
            this.friends.put(newFriend.getName(), newFriend);
            //NOT SURE if the following line is working, TEST THIS!!!!
            newFriend.getFriendsMap().put(this.getName(), this);
            return true;
        } else
            // The input person and this person are already friends.
            // CANNOT add.
            return false;  
    }
    
    
    public void addChild(People newChild)
    {
        
    }

}
