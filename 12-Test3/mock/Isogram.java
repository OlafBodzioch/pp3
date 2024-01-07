public class Isogram {
    
    public static boolean isogram(String x)
    {

        for (int i = 0; i < x.length(); i++) 
        {
            
            for (int j = 0; j < x.length(); j++) 
            {
            
                if(j!=i && x.charAt(i) == x.charAt(j))
                    {
                        return false;
                    }

            }   

        }
        return true;
        
    }

    public static void main(String[] args) {
        
        String xx1 = "red sun";
        String xx2 = "blue water";
        String xx3 = "BLUE water"; 
        String xx4 = "my blue water"; 

    System.out.println(isogram(xx1));
    System.out.println(isogram(xx2));
    System.out.println(isogram(xx3));
    System.out.println(isogram(xx4));

}
}
