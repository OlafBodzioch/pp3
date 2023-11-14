public class Alphabet {
    
    public static boolean isAlphabet(String x)
    {

        boolean is=true;

        String x1;
        x1 = x.toLowerCase();

        for(int i=0; i<x1.length()-1; i++)
        {
            if(x1.charAt(i)>x1.charAt(i+1))
            {
                return false;
            }
        
        }

        return true;
    }

    public static void main(String[] args)
    {

        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
        
    }

}
