import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Cities{

    ArrayList<String> cityList;

    public Cities(ArrayList<String> cityList1) 
    {
        this.cityList = cityList1;
    }

    public ArrayList<String> filter(char s)
    {

        ArrayList<String> list0 = this.cityList;

        ArrayList<String> list1 = new ArrayList<String>();

        for (String string : list0) 
        {

            if(string.charAt(0)==s)
                list1.add(string);
        }

        return list1;

    }
    

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("animals"); 

        ArrayList<String> x22 = new ArrayList<>(Arrays.asList("Warszawa", "Sopot", "Kielce","Szczecin"));

        Cities x11 = new Cities(x22);

        System.out.println(x11.filter('S'));

    }
    
}
