public class Third {
    private static String toCamelCase(String word)
    {
        String bakbak = "";
        int count = 0;
        char [] temp;
        for(String retval : word.split("_"))
        {
            if(count == 0)
                bakbak += retval;
            else
            {
                temp = retval.toCharArray();
                temp[0] = Character.toUpperCase(temp[0]);
                bakbak += new String(temp);
            }
            count++;
        }
        return bakbak;
    }
    private static String toSnakeCase(String word)
    {
        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
        return word.replaceAll(regex,replacement).toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("isModalOpen"));
        System.out.println(toSnakeCase("helloEdabit"));
    }
}
