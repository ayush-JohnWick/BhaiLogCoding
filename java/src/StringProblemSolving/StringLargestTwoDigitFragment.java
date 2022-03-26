package StringProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class StringLargestTwoDigitFragment {

    public void LargestStringFragment() {
        String s = "50552";
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            sb.append(s.charAt(i + 1));
            intList.add(Integer.parseInt(sb.toString()));
        }
        int largestFragment = Integer.MIN_VALUE;
        for (Integer i : intList) {
            if (i > largestFragment) {
                largestFragment = i;
            }
        }
        System.out.println("Largest Fragment is " + largestFragment);
    }
}
