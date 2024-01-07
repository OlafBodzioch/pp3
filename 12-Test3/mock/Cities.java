public class Cities {
    

    String [] cityList;

    public Cities(String [] cityList1) 
    {
        this.cityList = cityList1;
    }

    public String filter(char s)
    {

        String [] list0 = this.cityList;

        String list1 = "";

        for (String string : list0) 
        {

            if(string.charAt(0)==s)
                list1 = list1 + string;
        }

        return list1;

    }
    

    public static void main(String[] args) {


        String [] x11 = {"Warszawa", "Sopot", "Kielce","Szczecin"};

        Cities x12 = new Cities(x11);

        System.out.println(x12.filter('S'));

    }
    
}