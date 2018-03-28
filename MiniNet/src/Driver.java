import java.util.*;

public class Driver {
    //Attributes
    private Map<String, People> people;
    private People currentPerson = null;
    
    
    //Constructor
    public Driver()
    {
        this.people = new HashMap<>();
    }
    
    
    
    
    //Methods
    //0. Executing the program, containing main do-while() menu loop.
    public void executing()
    {
        
    }
    
    //1. Add a person into the network.
    public void addNewProfile()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===ADDING  NEW  PROFILE===");
        System.out.println("Enter first name: ");
        //trim all white spaces in user input and
        //store name(s) in a String var.
        String firstName = scanner.nextLine().replaceAll("\\s+","");
        System.out.println("Enter first name: ");
        String lastName = scanner.nextLine().replaceAll("\\s+","");
        
        while(validateUserInput(firstName+ " " + lastName))
        {
            System.out.println("Name '" + firstName + " " + lastName 
                            + "' has already existed in the system.");          
            System.out.println("Would you like to try again?? (y/n)");
            String check = scanner.nextLine();
            if (check.equals("y"))
                continue;
            else
                return;
        }
        
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.next();
        
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        
        if (age > 16)
            this.people.put(firstName+ " " +lastName,
                    new Adult(firstName, lastName, age, gender) );
        else
        if (age > 2)
            this.people.put(firstName+ " " +lastName,
                    new Teenager(firstName, lastName, age, gender) );
        else
            this.people.put(firstName+ " " +lastName,
                    new Baby(firstName, lastName, age, gender) );
        
        System.out.println(lastName + "'s profile: successfully added.");
    }

    
    //2. Select a person by name.
    public void selectPersonByName()
    {
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("===SELECTING  A  PERSON===");
            System.out.println("Enter full name: ");
            String name = scanner.nextLine();
            
            if (validateUserInput(name))
            {
                System.out.println("Successfully selected: "
                                    + name + "'s profile!");
                return;
            }
            else
            {
                System.out.println("Problem: profile of '" + name
                                    + "' canNOT be found.");
                System.out.println("Would you like to try again?? (y/n)");
                if (!scanner.nextLine().equals("y"))
                    check = false;
            }
        } while (check == true);
    }
    
    //Validating if input name (first+" "+last) existed in the system.
    public boolean validateUserInput(String name)
    {   
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String name = scanner.nextLine();
        
        Iterator iterator = this.people.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            if (name.equals(pair.getKey()))
            {
                //Entered name EXISTS in the system.
                this.currentPerson = (People) pair.getValue();
                return true;
            }
            iterator.remove(); // avoids a ConcurrentModificationException
        }
        
        //Entered name is NOT in the system.
        return false;
    }
    
    
    //3. Display the profile of the selected person
    // This method is implemented differently in Adult, Teenager and Baby
    // and being called here.
    
    
    //4. Update the profile information of the selected person
    
    
    
    //5. Delete the selected person
    
    
    //6. Connect two persons in a meaningful way (e.g. friend, parent)
    

    //7. Find out friendship.
    
    
    //8. Find out parents/children.
    
    
    
    //Display menu
    public void displayMenu()
    {
        System.out.println("MiniNet Menu");
        System.out.println("===================================");
        System.out.println("1.  List everyone");
        System.out.println("2.  Select a person");
        System.out.println("3.  Display selected person");
        System.out.println("4.  Update selected person");
        System.out.println("5.  Delete selected person");
        System.out.println("6.  ");
        System.out.println("7.  Find out friendship of two people");
        System.out.println("8.  Find out parents/children\n"
                        + "     of the selected person");
        System.out.println("9.  Exit\n");
        System.out.print("Enter an option: ");
    }//end of displayMenu()
    
}//END of Driver class
