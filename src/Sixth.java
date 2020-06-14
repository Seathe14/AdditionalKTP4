public class Sixth {
    private static int bugger(int value)
    {
        String VS = String.valueOf(value);
        int result;
        int counter = 0;
        while(VS.length()>1)
        {
            result = 1;
            for(int i =0;i<VS.length();i++)
            {
                result *= Character.getNumericValue(VS.charAt(i));
            }
            VS = String.valueOf(result);
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));

    }
}
