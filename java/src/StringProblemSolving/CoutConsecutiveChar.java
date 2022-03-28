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
}
