public class Computer {
    
    private String mainboard;
    private boolean isOn;
    private int driveSpace;
    private Processor processor;
    
    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getDriveSpace() {
        return driveSpace;
    }

    public void setDriveSpace(int driveSpace) {
        this.driveSpace = driveSpace;
    }

    public Computer(String mainboard, boolean isOn, int driveSpace, int x, int y) {
        this.mainboard = mainboard;
        this.isOn = isOn;
        this.driveSpace = driveSpace;

        this.processor = new Processor(x,y);
    }

    public void turnOn()
    {
        this.isOn = true;
    }

    public void turnOff()
    {
        this.isOn = false;
    }

    public void occupySpace(int x)
    {
        this.driveSpace =- x;
    }

    public void freeUpSpace(int x)
    {
        this.driveSpace =+ x;
    }

    public String toString() {
        return "Computer [mainboard=" + mainboard + ", isOn=" + isOn + ", driveSpace=" + driveSpace + ", processor="
                + processor + "]";
    }

    
    public static void main(String[] args) 
    {
        Computer konkuter = new Computer("nieznana płyta głowna", false, 1240000, 2, 4);

        System.out.println(konkuter.toString());        

    }

}
