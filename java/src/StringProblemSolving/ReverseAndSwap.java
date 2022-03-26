package StringProblemSolving;

import java.util.Scanner;

public class ReverseAndSwap {
    public void ReverseString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Simple logic
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse of String is " + reverse);
        //logicUsingCharArray
        // reverse the string and convert it to `char[]` array
        char[] chars = new StringBuilder(str).reverse().toString()
                .toCharArray();

        // iterate over char[] using the for-each loop
        for (char ch : chars) {
            System.out.print(ch);
        }
    }
}
