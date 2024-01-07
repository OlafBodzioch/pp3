public class Person {
    
    private String name;
    private String surname;

    public Person(String name, String surname) 
    {
        this.name = name;
        this.surname = surname;
    }

    public String f()
    {
        String result = "";
        result = result + this.name.charAt(0) + this.surname.charAt(0);
        result = result.toUpperCase();
        System.out.println(result);
        return result;
    }

}
