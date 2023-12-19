public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{

    private boolean isOn;
    private int channel;
    private int volume;

    public TV() {
    }

    public TV(boolean isOn, int channel, int volume) {
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
    }

    public void on() {
        this.isOn = true;
        this.channel = 1;
        this.volume = 1;
    }

    public void off() {
        this.isOn = false;
    }

    public void channelUp() {
        if (this.isOn) 
        {
            if(this.channel==99)
                this.channel=0;
            else
                this.channel++;
        }
        else
            System.out.println("Error, the TV is off.\n");
    }


    public void channelDown() {
        if (this.isOn) 
        {
            if(this.channel==1)
                this.channel=99;
            else
                this.channel--;
        }
        else
            System.out.println("Error, the TV is off.\n");
    }

    public void channelChange(int r) {
        if (this.isOn) 
        {
            if (r>=1 && r<=99) 
            {
                this.channel = r;
            }
            else
            {
                System.out.println("Error, the channel does not exist.\n");
            }
        }
        else
            System.out.println("Error, the TV is off.\n");
    }

    public void volumeUp() 
    {
        if (this.isOn) {
            if(volume<10){
                volume++;
            }
            else
                System.out.println("Error, volume MAX reached.\n");
        }
        else
            System.out.println("Error, the TV is off.\n");
    }

    public void volumeDown() 
    {
        if (this.isOn) {
            if(volume>1){
                volume--;
            }
            else
                System.out.println("Error, volume MIN reached.\n");
        }
        else
            System.out.println("Error, the TV is off.\n");
    }

    public String tvStatus() {
        if(this.isOn==true)
            return "The TV is on.\nThe channel is: "+this.channel+"\nThe volume is: "+this.volume+"\n";
        else
            return "The TV is off\n";
    }


    public static void main(String[] args) {
     
        
        TV x1 = new TV();

        x1.on();
        System.out.println(x1.tvStatus());
        x1.off();
        System.out.println(x1.tvStatus());

        x1.on();
        x1.channelUp();
        System.out.println(x1.tvStatus());
        x1.channelChange(7);
        System.out.println(x1.tvStatus());
        x1.channelChange(142);
        System.out.println(x1.tvStatus());
        x1.channelDown();
        System.out.println(x1.tvStatus());
        x1.off();
        System.out.println(x1.tvStatus());

        x1.on();
        System.out.println(x1.tvStatus());
        x1.channelChange(15);
        System.out.println(x1.tvStatus());

        for(int i=0;i<6;i++)
        {
            x1.volumeUp();
        }

        System.out.println(x1.tvStatus());
        x1.off();
        System.out.println(x1.tvStatus());

        x1.on();
        for(int i=0;i<11;i++)
        {
            x1.volumeUp();
        }
        System.out.println(x1.tvStatus());

    }

}
