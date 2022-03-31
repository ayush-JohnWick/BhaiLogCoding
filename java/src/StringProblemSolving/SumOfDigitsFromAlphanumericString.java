package StringProblemSolving;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigitsFromAlphanumericString {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter a String with spaces and Alphanumeric with text and numbers:");
        String input=in.nextLine();
        System.out.println("type 1 for solve using Normal Approach or 2 using PatternApproach");
        int sum=0;
        int approach=Integer.parseInt(in.nextLine());

        sum=(approach==1)?findSumofDigitsFromAphanumericusingNormal(input):findSumofNumbersUsingPatternApproach(input);

        System.out.println("Sum of all numbers from aphanumeric String is-->"+sum);
    }

    public static int findSumofNumbersUsingPatternApproach(String data)
    {
        Matcher m = Pattern.compile("(\\d+)").matcher(data);
        int sum=0;
        while(m.find())
        {

            System.out.println(m.group());
            sum+=Integer.parseInt(m.group());

        }

        return sum;
    }

    public static int findSumofDigitsFromAphanumericusingNormal(String data)
    {
        String modified=data.replaceAll("(\\D+)", " ").trim();
        String finalValue=modified.replaceAll("(\\s+)", " ");
        String[] fi= finalValue.split(" ");
        int sum=0;

        for(int i=0;i<fi.length;i++)
        {
            System.out.println(fi[i]);
            sum+=Integer.parseInt(fi[i]);

        }
        return sum;

    }

}
