public class C6 {
    
    private String title;
    private int pages;

    public void setTitle(String x)
    {
        this.title = x;
    }

    public void setPages(int y)
    {
        if(y>0)
            this.pages = y;
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getPages()
    {
        return this.pages;
    }

    public static void main(String[] args) 
    {
       
        C6 o = new C6();
        System.out.println(o.getTitle());
        System.out.println(o.getPages());

        o.setPages(3);
        System.out.println(o.getTitle());
        System.out.println(o.getPages());

        o.setPages(-4);
        System.out.println(o.getTitle());
        System.out.println(o.getPages());

        o.getPages();
        System.out.println(o.getTitle());
        System.out.println(o.getPages());
        
    }

}
