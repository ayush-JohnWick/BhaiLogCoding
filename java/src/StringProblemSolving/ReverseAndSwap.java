package StringProblemSolving;

import java.util.Scanner;

public class ReverseAndSwap {
    public void ReverseString(){
        Scanner sc= new Scanner(System.in);
       String str= sc.nextLine();
       String reverse="";
       for(int i=str.length()-1; i>=0;i--){
           reverse+=str.charAt(i);
       }
        System.out.println("Reverse of String is "+ reverse);
    }
}
