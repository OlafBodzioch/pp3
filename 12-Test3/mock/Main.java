public class Main {
    
    public static void main(String[] args) 
    {
        

    Person x1 = new Person("Francis", "Morgan");

    System.out.println(x1.f());

    boolean arr[] = {false,true,false};
    boolean arr3[] = {true,false,false};
    boolean arr2[] = {true,false,true,true,false,true,false,true,false};
    
    Logic x2 = new Logic(arr);

    System.out.println(x2.different());
    System.out.println(new Logic(arr3).different());
    System.out.println(new Logic(arr2).different());
    
    }
}
