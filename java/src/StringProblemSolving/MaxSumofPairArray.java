package StringProblemSolving;

import java.util.*;

public class MaxSumofPairArray {



    public static void MaxSumPair() {
        int[] arr = {1, 2, 3, 4,  5, 6, 7,  8};
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
         int pair = sc.nextInt();
         StringBuilder sb = new StringBuilder();
        String[] strArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArray[i] = String.valueOf(arr[i]);
        }
       String[] str= Arrays.toString(strArray).replaceAll("(\\s+)", "").split(",");
        for(int i=0; i<str.length; i++){
            sb.append(str[i]);
        }
        String newString= sb.toString();
       int[] newArr= new int[newString.length()];
        for(int i=0; i<newString.length()-1; i++){
            StringBuilder newStringBuilder = new StringBuilder();
           if(i<=pair) {
               newStringBuilder.append(newString.charAt(i));
               newStringBuilder.append(newString.charAt(i + 1));
           }
        }
        System.out.println("New pair array is "+ newArr);


    }
}
