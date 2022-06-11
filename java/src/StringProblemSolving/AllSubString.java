package StringProblemSolving;

public class AllSubString {

    public static void main(String[] args) {
        String str="abcdef";
        char[] strArr= str.toCharArray();
        int length= strArr.length;
        AllSubString.subString(strArr, length);
    }
    // Function to print all sub strings
    static void subString(char str[], int n) {
        // Pick starting point
        for (int i=1; i<=n; i++) {
            // Pick ending point
            for (int j=0; j<=n-i; j++ ) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int k=j+i-1;
                for (int l=j;l<=k;l++) {
                    System.out.print(str[k]);
                }

                System.out.println();
            }
        }
    }

}
