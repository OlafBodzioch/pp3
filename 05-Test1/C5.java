public class C5 {

    public int x;
    public int y;

    C5(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public boolean isX()
    {
        if (this.x>0) {
            return true;
        }
        return false;
    }

    public boolean isY()
    {
        if (this.y>0) {
            return true;
        }
        return false;
    }

    public String toString()
    {

        int x1 = this.x;
        int y1 = this.y;

        String result = "P("+Integer.toString(x1)+","+Integer.toString(y1)+")";
        return result;
    }
    

    public static void main(String[] args) {
        
        C5 o = new C5(3,0);

        System.out.println(o.isX());

        System.out.println(o.isY());

        System.out.println(o.toString());

    }

}
