import StringProblemSolving.*;

import java.util.Arrays;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        ReverseAndSwap rs = new ReverseAndSwap();
        rs.ReverseString();
        StringFormatA_B ab = new StringFormatA_B();
        ab.ReplecateA_B();
        StringLargestTwoDigitFragment largestFragment = new StringLargestTwoDigitFragment();
        largestFragment.LargestStringFragment();
        StringFormatA_B formatString = new StringFormatA_B();
        formatString.ReplecateA_B();
        CoutConsecutiveChar cs = new CoutConsecutiveChar();
        cs.ConsecutiveChar();
        cs.ConsecutiveCharUsingMap();
        SubStringPallindrome sb = new SubStringPallindrome();
        sb.findPalindromicSubstrings("Google");
        MaxDuplicatesCharacter mx = new MaxDuplicatesCharacter();
        mx.findMaxDuplicate("aabbcccc");

    }
}
