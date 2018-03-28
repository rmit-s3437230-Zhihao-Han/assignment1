import java.util.*;

public class Baby extends People {
    
    //Attributes
    private Map<String, Adult> parents;

    
    //Constructor
    public Baby(String _firstName, String _lastName, int _age,
            String _gender) {
        super(_firstName, _lastName, _age, _gender);
        this.parents = new HashMap<>();
    }
    
    //Accessors
    public Adult getFather() {
        return this.parents.get("Father");
    }
    
    public Adult getMother() {
        return this.parents.get("Mother");
    }

    @Override
    public void displayProfile() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateProfile() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void findParentsChildren() {
        // TODO Auto-generated method stub
        
    }
    
    //Mutators
    

}
