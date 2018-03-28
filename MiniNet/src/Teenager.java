import java.util.*;

public class Teenager extends People {

    //Attributes
    private String status;
    private Adult dad;
    private Adult mom;
    private Map<String, Teenager> friends;

    public Teenager(String _firstName, String _lastName, int _age,
            String _gender, Adult _dad) {
        super(_firstName, _lastName, _age, _gender);
        this.status = "";
        this.friends = new HashMap<>();
        this.dad = _dad;
        this.mom = _dad.getPartner();
    }
    
    
    // Accessors
    public Map getFriendsMap()
    {
        return this.friends;
    }
    
    public Adult getDad() {
        return this.dad;
    }
    
    public Adult getMom() {
        return this.mom;
    }
    
    
    // Mutators
    public void setStatus(String _status) {
        this.status = _status;
    }

    
    public boolean addFriend(Teenager newFriend) {
        // Check whether the input adult's name has already been
        // in this object's friends map.
        // If NOT: add new friend.
        // If YES: return false and let the call method handle this.
        if (!alreadyExisted(newFriend.getName(), this.friends)) {
            this.friends.put(newFriend.getName(), newFriend);
            // NOT SURE if the following line is working, TEST THIS!!!!
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
        
        //Print out parents name.
        System.out.printf("%-10s%s", "Dad:", this.dad.getName());
        System.out.printf("%-10s%s", "Mom:", this.mom.getName());
    }


    @Override
    public void updateProfile(Map _people) {
        int option;
        do {
            printSubMenu();
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            scanner.nextLine();        
            switch(option)
            {
            case 1: 
                //Store old name which is the key in map, 
                //before updating new value and new key.
                //(because key in map is actually the full name)
                String oldName = this.getName();
                System.out.println("Enter first name: ");
                this.setFirstName(scanner.nextLine().replaceAll("\\s+", ""));
                System.out.println("Enter last name: ");
                this.setFirstName(scanner.nextLine().replaceAll("\\s+", ""));
                
                //putting a new pair of key-value with updated value
                //in the map.
                _people.put(this.getName(), this);
                //removing the old pair key-value with old full name as key.
                _people.remove(oldName);
                System.out.println("Name: UPDATED to " + this.getName());
                break;
                
            case 2:
                System.out.println("Enter new age: ");
                this.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Age: UPDATED to " + this.getAge());
                break;
                
            case 3:
                System.out.println("Enter new gender: ");
                this.setGender(scanner.nextLine().replaceAll("\\s+", ""));
                System.out.println("Gender: UPDATED to " + this.getGender());
                break;
                
            case 4:
                System.out.println("Enter new status: ");
                this.setStatus(scanner.nextLine().replaceAll("\\s+", ""));
                System.out.println("Status: UPDATED!");
                break;
            
            default:
                break;
            }
            scanner.close();
        } while(option != 5);
    }


    public void listParents() {
        System.out.println("Dad: " + this.dad.getName());
        System.out.println("Mom: " + this.mom.getName());
    }// end: listParents()
    
    
    //Print out sub-menu for updateProfile option.
    public void printSubMenu()
    {
        System.out.println("===UPDATING  SELECTED  PROFILE===");
        System.out.println("  1. Update NAME");
        System.out.println("  2. Update AGE");
        System.out.println("  3. Update GENDER");
        System.out.println("  4. Update STATUS");
        System.out.println("\n  Enter number\n"
        + "  associated with your prefered option: ");
    }
    
    @Override
    public void findParentsChildren() {
        // TODO Auto-generated method stub
        
    }
}
