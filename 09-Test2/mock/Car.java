public class Car extends Vehicle{

    private int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int[] spec()
    {
        int[] arr = new int[2];
        
        arr[0]=this.getSeats();
        arr[1]=this.getMaxSpeed();

        return arr;

    }


    public static void main(String[] args) {
     
        Car x1 = new Car(4,33);

        int[] arr = new int[2];

        arr = x1.spec();

        for (int i : arr) {
            System.out.println(i);
        }
        
    }    
}
