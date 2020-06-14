public class Fourth {
    private static String overPay(double [] parameters)
    {
        double pay = 0;
        if(parameters[0] < 17)
        {
            if(parameters[1] <= 17) {
                pay = (parameters[1] - parameters[0]) * parameters[2];
            }
            else if(parameters[1] > 17)
            {
                pay = (17 - parameters[0]) * parameters[2] + (parameters[1] - 17) * parameters[2] * parameters[3];
            }
        }
        else
        {
            pay = (parameters[1] - parameters[0]) * parameters[2] * parameters[3];
        }
        String result = String.format("%.02f",pay);
        return "$" + result;
    }
    public static void main(String[] args) {
        System.out.println(overPay(new double[]{9,17,30,1.5}));
        System.out.println(overPay(new double[]{16,18,30,1.8}));
        System.out.println(overPay(new double[]{13.25,15,30,1.5}));
    }
}
