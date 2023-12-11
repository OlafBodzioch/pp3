public class SuperCounter extends Counter{

    private int n;

    public SuperCounter(int c) {
        super(c);
    }

    public void addN(int n){
        for(int i=0;i<n;i++)
            super.add1();
    }

    public static void main(String[] args) {
        
        SuperCounter x1 = new SuperCounter(0);

        x1.addN(30);

        System.out.println(x1.getCounter());

    }

}
