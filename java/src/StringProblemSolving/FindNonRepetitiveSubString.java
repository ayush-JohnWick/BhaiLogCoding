package StringProblemSolving;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * Find out the different Substring with non repetitive character ,Two substring are different
 * if they have different start or end index
 * @author Sabyasachi
 *s
 */
public class FindNonRepetitiveSubString {
    static List<String> s = new ArrayList<String>();

    static void powerSet(String str, int index, String curr) {
        int n = str.length(); // base case
        if (index == n) {
            return;
        }
        String ch=String.valueOf(str.charAt(index));
        String y=curr+ch;

        if (!curr.contains(ch) && str.contains(y)) {
            curr += String.valueOf(str.charAt(index));
            s.add(curr);
            powerSet(str,index+1, curr);
            curr = curr.substring(0, curr.length() - 1);
        }
    }// Driver code

    public static void main(String[] args) {

        String str = "abac";
        //int index = -1;
        String curr = "";
        for (int i=0;i<str.length();i++)
        {
            powerSet(str, i, curr);
        }

        System.out.println(s.toString());
        System.out.println(s.size());
    }

}
