public class Zad21 {
        public static void main(String[] args)
    {
    //21
        float height = 170;
        float heightF = 170*0.0328084f;
        heightF = Math.floor(heightF);

    //22
        int speed = 158;
        System.out.println("Vehicle speed: "+ speed);
        if(speed>40 && speed<140){
            System.out.println("Speed is valid: True");
        }else System.out.println("Speed is valid: False");
    }
}
