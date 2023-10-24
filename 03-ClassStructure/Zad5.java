public class Zad5 {
    
    static int compare(int x, int y)
    {
        if(x>y){
            return x;
        }
        else if(y>x){
            return y;
        }
        else 
        {
            System.out.println("błąd");
            return 0;
        }
    }

    static void showPi()
    {
        System.out.println(Math.PI);
    }

    static void absoluteValue(int x)
    {
        System.out.println(Math.abs(x));
    }

    static void squareRoot(int x)
    {
        double z = Math.sqrt(x);
        System.out.println(z);
    }

    static float randomGen1()
    {
        float x = (float)Math.random();
        return x;
    }

    static int randomGen2()
    {
        int x = (int)Math.random()*11;
        return x;
    }

    static float sine(int x)
    {
        float z = (float)Math.toDegrees(x);
        float y = (float)Math.sin(z);
        return y;
    }

    public static void main(String[] args)
    {

        

    }

}
