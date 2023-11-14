public class C3 {
    
    public static boolean isAlphabet(String x)
    {

        for(int i=0; i<x.length()-1 ; i++)
        {
            if (x.charAt(i)>x.charAt(i+1)) 
            {
                return false;
            }
        }

        return true;

    }

    public static String hideText(String x)
    {
        String x2 = "";

        for(int i=0; i<x.length(); i++)
        {
            if (i==0 || i==x.length()-1) 
            {
                x2 = x2 + x.charAt(i);
            }
            else
                x2 += "*";
        }

        return x2;
    }



    public static void main(String[] args) {
        
        
			System.out.println(C3.isAlphabet("abegsw"));
			System.out.println(C3.isAlphabet("abcmhsw"));
			System.out.println(C3.hideText("apple"));
			System.out.println(C3.hideText("ok"));
			


    }

}
