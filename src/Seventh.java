import java.util.HashSet;

public class Seventh {
    private static String toStarShorthand(String str)
    {
        if(str.length() == 0)
            return "";
        int currentLength = 1;

        StringBuilder result = new StringBuilder(); // empty string
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                result.append(str.charAt(i - 1)).append(currentLength > 1 ? "*" + currentLength : ""); // if(currLength > 1) "*" + currLength, else ""
                currentLength = 1; // reset the length
            }
        }

        // print last one
        result.append(str.charAt(str.length() - 1)).append(currentLength > 1 ? "*" + currentLength : "");
        System.out.println("result = " + result.toString());
        return "Hello";
    }
    public static void main(String[] args) {
        toStarShorthand("abbccc");
        toStarShorthand("77777gefff");
        toStarShorthand("abc");
        toStarShorthand("");
    }
}
