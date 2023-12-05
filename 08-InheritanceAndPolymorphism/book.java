public class book {
    
    protected String name;
    protected String author;
    protected String gatunek;
    protected int pages;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getGatunek() {
        return gatunek;
    }
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    public book(String name, String author, String gatunek, int pages) {
        this.name = name;
        this.author = author;
        this.gatunek = gatunek;
        this.pages = pages;
    }
    public String display() {
        return "book name=" + name + ", author=" + author + ", gatunek=" + gatunek + ", pages=" + pages;
    }

    public void addPage()
    {
        this.pages = this.pages+1;
    }

    
    public static void main(String[] args) {
        
        book x1 = new book("ksionszka", "toking ben","nie wiem", 4);
        book x2 = new book("O Psie Ktory Jezdzil Koleją","nieznany", "Roman Pisarski", 34);

        System.out.println(x1.display());
        System.out.println(x2.display());
    }
    
    

}
