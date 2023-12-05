import java.util.ArrayList;

public class library {

    static ArrayList<book> arr1 = new ArrayList<book>();

    
    public static void main(String[] args) 
    {
        
        book x1 = new book("ksionszka", "toking ben","nie wiem", 4);

        ebook x2 = new ebook("O psie ktory jezdzil koleją", "ROMAN PISARSKI", "nie pamietam", 44, "opsie.pdf");
            
        ebook x3 = new ebook("and then there were none", "agatha christie", "mystery", 144, "ksianga2.pdf");

        audiobook x4 = new audiobook("o psie ktory jzdzlil kolejomm", "roman pisarski", "book", 0, 130, 20);

        audiobook x5 = new audiobook("lalka", "prus boleslaw", "historyczny", 0, 320, 60);
    
        arr1.add(x1);
        arr1.add(x2);
        arr1.add(x3);
        arr1.add(x4);
        arr1.add(x5);

        for(book i: arr1)
        {
            System.out.println(i.display()+"\n");
        }

    }

}
