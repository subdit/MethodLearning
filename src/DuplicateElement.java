import java.security.KeyStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        String[] names = {"Java", "JavaScript", "Ruby", "Node.js", "Python", "C", "C", "Java"};
        //My way of doing this
//        Map<String, Integer> newCount = new HashMap<String, Integer>();
//        for(String name : names){
//            i
//            if(newCount)
//        }

        // 1. Compare each element: 0(nxn) ---worst solution
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("duplicate element is: " + names[i]);
                }
            }

        }
        // 2. Using HashSet is Java collection: it stores unique values: 0(n)
        System.out.println("*********** HashSet **************");
        Set<String> original = new HashSet<String>();
        for (String name : names) {
            if (original.add(name) == false) {
                System.out.println("Duplicate element:: " + name);
            }
        }
        // 3. using HashMap:
        System.out.println("********* HashMap **********");
        HashMap<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String name : names) {
            Integer count = (storeMap.get(name));
            if (count == null) {
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, ++count);
            }
        }

        System.out.println("****** using Map *********");
        Map<String, Integer> storeMap2 = new HashMap<String, Integer>();
        for (String name : names) {
            Integer count = storeMap2.put(name, 1);
            if (count != null) {
                System.out.println("Duplicate element is:::" + name);
            }
        }
    }
}

