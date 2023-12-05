public class audiobook extends book{

    private int minutes;
    private int seconds;
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public audiobook(String name, String author, String gatunek, int pages, int minutes, int seconds) {
        super(name, author, gatunek, pages);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void addMinutes(int n)
    {
        this.minutes = this.minutes + n;
    }
    
    public void addSeconds(int n)
    {
        if(this.seconds>60)
            this.seconds = this.seconds + n;
        else
            {
                this.minutes = this.minutes + 1;
                this.seconds = n-1;
            }
    }
    

    public String display()
    {
        return "audiobook name=" + name + ", author=" + author + ", gatunek=" + gatunek + ", pages=" + pages +", minutes=" + minutes + ", seconds=" + seconds;
    }

    public static void main(String[] args) {
        audiobook x1 = new audiobook("o psie ktory jzdzlil kolejomm", "roman pisarski", "book", 0, 130, 20);
    
        System.out.println(x1.display());

    }
}
