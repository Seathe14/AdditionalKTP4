public class Eighth {
    private static boolean doesRhyme(String first,String second)
    {
        String lastFirst = "";
        String lastSecond = "";
        for(String word : first.split(" "))
            lastFirst = word;
        for(String word : second.split(" "))
            lastSecond = word;
        String firstVow = "",secondVow="";
        lastFirst = lastFirst.toLowerCase();
        for(int i =0; i < lastFirst.length();i++)
        {
            if(lastFirst.charAt(i) == 'a' || lastFirst.charAt(i) == 'e' || lastFirst.charAt(i) == 'i' ||
                    lastFirst.charAt(i) == 'o' || lastFirst.charAt(i) == 'u') {
                firstVow += lastFirst.charAt(i);
            }
        }
        lastSecond = lastSecond.toLowerCase();
        for(int i =0; i < lastSecond.length();i++)
        {
            if(lastSecond.charAt(i) == 'a' || lastSecond.charAt(i) == 'e' || lastSecond.charAt(i) == 'i' ||
                    lastSecond.charAt(i) == 'o' || lastSecond.charAt(i) == 'u') {
                secondVow+= lastSecond.charAt(i);
            }
        }
        return firstVow.equals(secondVow);
    }
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam i am!","Green eggs and ham."));
        System.out.println(doesRhyme("Sam i am!","Green eggs and JAM."));
        System.out.println(doesRhyme("You are off to the races","a splendid day."));
        System.out.println(doesRhyme("and frequently do?","you gotta move"));
        System.out.println(doesRhyme("and frequently do?","yes i do"));
    }
}
