import java.util.*;

public class Baby extends People {
    private HashMap parents = new HashMap<String, People>();

    public Baby(String _firstName, String _lastName, byte _age,
            char _gender) {
        super(_firstName, _lastName, _age, _gender);
    }

}
