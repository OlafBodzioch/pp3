public class Zadania {
        public static void main(String[] args)
    {
    //21
        double height = 170;
        double heightFeet = 170*0.0328084;
        heightFeet = Math.floor(heightFeet);
        double inches = Math.round((height-(heightFeet/0.0328084))*0.393701);

        System.out.println("I am "+ height +"cm tall, i.e. "+ (int)heightFeet +" feet and "+ (int)inches + " inches");

        

    //22
        int speed = 158;
        System.out.println("Vehicle speed: "+ speed);
        if(speed>40 && speed<140)
        {  
            System.out.println("Speed is valid: True");
        }
        else
        {
            System.out.println("Speed is valid: False\n");
        }

    //23
        float eurSell = 4.5940f;
        float eurBuy = 4.6250f;

        System.out.printf("Bank buys for: %.4f\n", eurBuy);
        
        System.out.printf("Bank buys for: %.4f\n", eurSell);
        
        System.out.printf("Spread: %.4f\n", (eurBuy-eurSell));
    
    //24    

        int hrs = 14;
        int min = 27;

        int calcMins = (hrs*60) + min;
        int calcSecs = 60*calcMins;
        
        System.out.println("Hour: "+ hrs +"\n");
        System.out.println("Minutes: "+ min +"\n");
        System.out.printf("Time: %02d:%02d%n\n", hrs, min);
        System.out.println("Minutes from midnight: "+ calcMins +"\n");
        System.out.println("Seconds from midnight: "+ calcSecs +"\n");

    
    
    
    
    
    
    }    
}

