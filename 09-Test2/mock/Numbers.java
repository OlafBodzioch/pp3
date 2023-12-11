public class Numbers {

    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x5;

    public Numbers(int x1,int x2, int x3,int x4, int x5)
    {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.x4=x4;
        this.x5=x5;        
    }

    public boolean different()
    {
        if(this.x1 != this.x2 && this.x1 != this.x3 && this.x1 != this.x4 && this.x1 != this.x5)
            if(this.x2 != this.x1 && this.x2 != this.x3 && this.x2 != this.x4 && this.x2 != this.x5)
                if(this.x3 != this.x2 && this.x3 != this.x1 && this.x3 != this.x4 && this.x3 != this.x5)
                    if(this.x4 != this.x2 && this.x1 != this.x3 && this.x4 != this.x1 && this.x4 != this.x5)
                        if(this.x5 != this.x2 && this.x5 != this.x3 && this.x5 != this.x4 && this.x5 != this.x1)
                            return true;
        return false;
    }


    
    public static void main(String[] args) {
        
        Numbers x1 = new Numbers(2,5,2,2,2);

        System.out.println(x1.different());



    }
}