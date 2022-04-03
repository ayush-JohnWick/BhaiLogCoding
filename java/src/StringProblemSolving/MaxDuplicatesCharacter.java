package StringProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
String str= "aabbccc"
output= "aab"
 */
public class MaxDuplicatesCharacter {
    public void findMaxDuplicate(String str){
        StringBuilder sb = new StringBuilder(str);
        Map<Character,Integer> map = new HashMap<>();
        char[] ch =str.toCharArray();
        for(Character c : ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else
                map.put(c,1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        int maxCount=0;
        char maxChar=0;
        for (Map.Entry<Character, Integer> entry : entrySet)
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Maximum Occurring char and its count :");
        System.out.println(maxChar+" : "+maxCount);

        //logic to remove the max occurance character from string
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)==maxChar){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("String without Maximum Occurring char is :");
        System.out.println(sb);


    }
}
