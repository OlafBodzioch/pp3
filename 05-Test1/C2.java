public class C2 {

    private int counter = 0;

    public void increase()
    {
        counter = counter + 1;
    }

    public void decrease()
    {
        counter = counter - 1;
    }

    public void increase(int x)
    {
        counter = counter + x;
    }

    public void decrease(int x)
    {
        counter = counter - x;
    }

    public int value()
    {
        return counter;
    }
    
    public static void main(String[] args) {
        C2 o = new C2();
        System.out.println(o.value());
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        System.out.println(o.value());

    }

}
