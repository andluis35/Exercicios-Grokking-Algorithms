package hashtableagenda;

import java.util.HashMap;

/**
 * @author Anderson Luis
 */

public class HashTableAgenda {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        
        phoneBook.put("Jenny", 8675309);
        phoneBook.put("Emergency", 911);
        
        System.out.println(phoneBook.get("Jenny"));
    }
    
}
