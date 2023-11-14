public class Temperature {

    static public float CelsToKel(float a)
    {
        return a+(float)273.15;
    }

    static public float KelToCels(float a)
    {
        return a-(float)273.15;
    }

    static public float FahrToCels(float a)
    {
        return (a-32)*(5/9);
    }

    static public float CelsToFahr(float a)
    {
        return a*(9/5)+32;
    }

    static public float FahrToKel(float a)
    {
        return (a-32)*(5/9)+(float)273.15;
    }

    static public float KelToFahr(float a)
    {
        return a*(9/5)-(float)273.15+32;
    } 

    public static void main(String[] args)
    {

        System.out.println(CelsToKel(25));
        System.out.println(CelsToFahr(25));
        System.out.println(FahrToKel(100));
        System.out.println(FahrToCels(100));
        System.out.println(KelToCels(0));
        System.out.println(KelToFahr(0));



    }
}
