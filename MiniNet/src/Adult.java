import java.util.*;

public class Adult extends People {

    // Attributes
    private Adult partner;
    private String status;
    private Map<String, Adult> friends;
    private Map<String, People> children;
 

    // Constructor
    public Adult(String _firstName, String _lastName, int _age,
            String _gender) {
        super(_firstName, _lastName, _age, _gender);
        this.status = "";
        this.partner = null;
        this.friends = new HashMap<>();
        this.children = new HashMap<>();
    }

    // Accessors
    public Map getFriendsMap()
    {
        return this.friends;
    }

    public Map getChildrenMap()
    {
        return this.children;
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
        // Check whether the input adult's name has already been 
        // in this object's friends map.
        // If NOT: add new friend.
        // If YES: return false and let the call method handle this.
        if ( !alreadyExisted(newFriend.getName(), this.friends) )
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
    
    @Override
    public void displayProfile() {
        System.out.println("===DISPLAYING  SELECTED  PROFILE===");
        System.out.printf("%-10s%s", "Name:", this.getName());
        System.out.printf("%-10s%s", "Age:", this.getAge());
        System.out.printf("%-10s%s", "Gender:", this.getGender());
        //Print out status if available.
        if (!this.status.equals(""))
            System.out.printf("%-10s%s", "Status:", this.status);
        //Print out partner's name if available.
        if ( !(this.partner == null) )
            System.out.printf("%-10s%s", "Partner:", this.partner.getName());
    }

    @Override
    public void updateProfile() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void findParentsChildren() {
        // TODO Auto-generated method stub
        
    }
    

}
