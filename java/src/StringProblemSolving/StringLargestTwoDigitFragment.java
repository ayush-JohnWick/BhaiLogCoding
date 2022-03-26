package StringProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class StringLargestTwoDigitFragment {

    /**
     * This function using String.length()
     */
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

    /**
     * THis approach using convert string into character Array
     *
     */

    public void FindLargestStringFragment()
    {
        String input="50552";
        char[] ar= input.toCharArray();
        List<Integer> ar1= new ArrayList();
        for(int i=0;i<ar.length;i++)
        {
            if(i!=ar.length-1)
            {
                StringBuilder bs=new StringBuilder();
                bs.append(ar[i]);
                bs.append(ar[i+1]);
                ar1.add(Integer.parseInt(bs.toString()));
            }
        }

        int biggestFragment=Integer.MIN_VALUE;
        for(Integer arr:ar1)
        {
            if(arr>biggestFragment)
            {
                biggestFragment=arr;

            }
        }

        System.out.println(biggestFragment);


    }
}
