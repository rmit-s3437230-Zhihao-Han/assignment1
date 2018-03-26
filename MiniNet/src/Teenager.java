import java.util.*;

public class Teenager extends People implements Socializing {
    private HashMap friends = new HashMap<String, People>();
    private HashMap parents = new HashMap<String, People>();

    public Teenager(String _firstName, String _lastName, byte _age,
            char _gender) {
        super(_firstName, _lastName, _age, _gender);
    }

    @Override
    public void setFriends(People _friend) {
        this.friends.put(_friend.getName(), _friend);
    }

}
