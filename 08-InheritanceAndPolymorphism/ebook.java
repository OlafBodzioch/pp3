public class ebook extends book {
    
    protected String filename;

    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public ebook(String name, String author, String gatunek, int pages, String filename) {
        super(name, author, gatunek, pages);
        this.filename = filename;
    }

    public String display() {
        return "ebook name=" + name + ", author=" + author + ", gatunek=" + gatunek + ", pages=" + pages + " filename" + filename;
    }

    public static void main(String[] args) {
        
        ebook x1 = new ebook("O psie ktory jezdzil koleją", "ROMAN PISARSKI", "nie pamietam", 44, "opsie.pdf");
        
        ebook x2 = new ebook("and then there were none", "agatha christie", "mystery", 144, "ksianga2.pdf");

        System.out.println(x1.display());

        System.out.println(x2.display());


    }
}
