public class Ninth {
    public static boolean trouble(long num1, long num2)
    {
        for (int i = 1; i < 10; i++)
        {
            if (Long.toString(num1).contains(Integer.toString(i) + Integer.toString(i) + Integer.toString(i)))
            {
                if (Long.toString(num2).contains(Integer.toString(i) + Integer.toString(i)))
                    return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(trouble(451999277,411722899));
        System.out.println(trouble(1222345,12345));
        System.out.println(trouble(666789,12345667));
    }
}
