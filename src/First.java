import java.util.LinkedList;
import java.util.List;

public class First {
    public static void main(String[] args) {
       System.out.println(Bessie("hello my name is Bessie",5,5));
    }
    private static List<String> Bessie(String essay, int wordsNumber, int lineLength) {
        String[] words = essay.split(" ");
        List<String> result = new LinkedList<String>();
        int remaining = lineLength;
        String str = "";
        for (String word : words) {
            if (remaining >= word.length()) {
                str += word;
                remaining -= word.length();
            } else {
                result.add(str);
                str = word;
                remaining = lineLength - word.length();
            }
        }
        result.add(str);
        return result;
    }
}
