import java.util.HashMap;

public class Test{
    
    public static  boolean isAnagram(String s, String t) {
        int counter = 1;
        // putting one of the String character into HashMap to check and get the value
        // efficiently
        HashMap<Integer, Character> map1 = new HashMap<>();
        // adding each character of String S as character Value and the Integer as Key.
        for (int i = 0; i < s.length(); i++) {
            map1.put(counter, s.charAt(i));
            counter++;
        }

        // creating second HashMap to store the character of t.
        HashMap<Integer, Character> map2 = new HashMap<>();
        for (int j = 0; j < t.length(); j++) {
            map2.put(counter, t.charAt(j));
        }
        // No we have create two map, comparing the two maps
        for (int check1 = 1; check1 <= s.length(); check1++) {
            // nested loop
            for (int check2 = 1; check2 <= t.length(); check2++) {
                if (map1.get(check1) == map2.get(check2)) {
                    return true;
                }
                
            }
        }
return false;
    }


    //main method
    public static void main(String[] args) {
        
        if(isAnagram("rat", "cat"));
        
    }}

