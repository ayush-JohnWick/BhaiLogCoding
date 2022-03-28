package StringProblemSolving;
/*
This program is for checking consecutive A and B and return the count to get the exact
number of character count and formatted string needs to be deleted to achieve formatted string i.e. A..AB..B
 */

public class StringFormatA_B {
    public void ReplecateA_B() {
        StringBuilder sb = new StringBuilder();
        String s = "AAABAB";
        sb.append(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == 'A') {
                        count++;
                        sb.deleteCharAt(j);
                        break;
                    }
                }
            }
        }
        System.out.println("Count of character that needs to be deleted is " + count + " " + "and formatted final string is " + sb);
    }
}
