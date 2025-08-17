import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        HashMap<Character, Integer> ht = new HashMap<>();
        ht.put('I',1);
        ht.put('V',5);
        ht.put('X',10);
        ht.put('L',50);
        ht.put('C',100);
        ht.put('D',500);
        ht.put('M',1000);
        int rsl = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            if (ht.get(s.charAt(i)) < ht.get(s.charAt(i+1))){
                rsl -= ht.get(s.charAt(i));
            }else {
                rsl += ht.get(s.charAt(i));
            }
        }
        return rsl+ht.get(s.charAt(s.length() - 1));
    }

}
