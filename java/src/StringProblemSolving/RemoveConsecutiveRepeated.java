package StringProblemSolving;

public class RemoveConsecutiveRepeated {

    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder();
        char ch[] = {'J', 'J','J', 'A', 'A','A', 'V', 'A','A'};
        for(int i=0; i<ch.length; i++){
           sb.append(ch[i]);
        }
        for(int i=0 ; i<sb.length()-1; i++){
            while(sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i + 1);
            }
        }
        System.out.println(sb);

    }





}
