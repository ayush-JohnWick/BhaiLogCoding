package StringProblemSolving;

import java.util.LinkedHashMap;
import java.util.Map;

public class CoutConsecutiveChar {
    /*
    Printing frequency of each character just after its consecutive occurrences
    Input : ccccOddEEEccC
    Output : c4O1d2E3c2C1
     */
    public void ConsecutiveChar() {
        String s = "ccccOddEEEccC";
        for (int i = 0; i < s.length(); i++) {
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)
                    + "" + count + "");
        }
    }
    public void ConsecutiveCharUsingMap(){
        String str = "ccccOddEEEccC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        String res = "";
        map.put(str.charAt(0), 1);
        char key = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else {
                res += Character.toString(key) + map.get(key);
                map.put(str.charAt(i), 1);
                key = str.charAt(i);
            }
        }
        res += Character.toString(key) + map.get(key);
        System.out.println(res);
    }
}
