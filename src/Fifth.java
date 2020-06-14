import java.text.DecimalFormat;

public class Fifth {
    private static String IMT(String weight, String height)
    {
        String result = "";
        String number = "";
        double kilo = 0;
        double meters = 0;
        int counter = 0;
        for(String split : weight.split(" "))
        {
           if(counter == 0)
            number = split;
           counter++;
            result = split;
        }
        counter = 0;
        if(result.equals("pounds"))
        {
            kilo = Integer.parseInt(number) / 2.205;
        }
        else
            kilo = Integer.parseInt(number);
        for(String split : height.split(" "))
        {
            if(counter == 0)
                number = split;
            counter++;
            result = split;
        }
        if(result.equals("inches"))
        {
            meters = Integer.parseInt(number) / 39.37;
        }
        else
            meters = Double.parseDouble(number);
        double IMT = kilo/(meters*meters);
        if(IMT > 25)
            return String.format("%.1f",IMT) + " Overweight";
        else if(IMT < 18.5)
            return String.format("%.1f",IMT) + " Underweight";
        else
            return String.format("%.1f",IMT) + " Normal weight";

    }
    public static void main(String[] args) {
        System.out.println(IMT("205 pounds", "73 inches"));
        System.out.println(IMT("55 kilos", "1.65 meters"));
        System.out.println(IMT("154 pounds", "2 meters"));
    }
}
