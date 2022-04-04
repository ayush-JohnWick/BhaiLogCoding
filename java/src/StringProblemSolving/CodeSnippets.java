package StringProblemSolving;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeSnippets {

    public static void main(String[] args) {

        CodeSnippets cp = new CodeSnippets();
        if (cp.BalancedString("{{ABCD}}")) {
            System.out.println("String is balanced");
        } else
            System.out.println("String is not balanced");
        cp.AddNumbersFromString();
        cp.RotateZeroToRight();
        cp.RotateZeroToLeft();

    }

    private void RotateZeroToLeft() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("Length of array is " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0)
                arr[pos--] = arr[i];
        }
        System.out.println("Position is " + pos);
        while (pos >= 0) {
            arr[pos] = 0;
            pos--;
        }
        System.out.println("Zeroes shifted to left " + Arrays.toString(arr));

    }

    private void RotateZeroToRight() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("Length is " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[pos++] = arr[i];
        }
        System.out.println("Position is " + pos);
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void AddNumbersFromString() {
        //add numbers from string
        String string = "Welcome123abc to 13 new city63";
        int sum = 0;
        Matcher m = Pattern.compile("(\\d)+").matcher(string);
        while (m.find()) {
            System.out.println("Number is " + m.group());
            sum += Integer.parseInt(m.group());
        }

        System.out.println("Sum is " + sum);
    }


    public boolean BalancedString(String s) {

        boolean flag = false;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current))
                stack.push(current);
            else if (map.values().contains(current)) {
                if (!stack.empty() && map.get(stack.peek()) == current) {
                    stack.pop();
                } else
                    return false;

            }
        }
        return stack.empty();

    }



}
