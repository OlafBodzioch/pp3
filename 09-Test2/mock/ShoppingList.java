import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShoppingList{

    private ArrayList<Product> products = new ArrayList<Product>();

    public void add(Product product) 
    {
        products.add(product);
    }

    public int total()
    {
        int count = 0;
        for (Product product : products) {
            count += product.getQuantity();
        }
        return count;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() 
    {
        String str = "";
        
        //int count = 1;

        for (Product product : products) {
            str += product.getName();
            str+= ","; 
            
            //if(count<this.products.size())     
            //count++;
        }
        return str.substring(0,str.length()-1);
    }

    
    public static void main(String[] args) {
        
        ShoppingList x1 = new ShoppingList();

        Product z2 = new Product("Apple", 4);
        Product z1 = new Product("Milk", 2);

        x1.add(z1);
        x1.add(z2);

        System.out.println(x1.total());

        System.out.println(x1.toString());
        
    }
    
}
