public class Family{

    private Person[] familyMembers;

    public Family(Person[] familyMembers) 
    {
        this.familyMembers = familyMembers;
    }

    public Person[] getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Person[] familyMembers) {
        this.familyMembers = familyMembers;
    }

    public int adults()
    {
        int count = 0;

        for (Person person : familyMembers) 
        {
            if(person.getAge()>=18)
            {
                count++;
            }
        }

        return count;
    }
    

    public static void main(String[] args) {
        

    Person x1 = new Person("benon", 11);
    Person x2 = new Person("zenon", 33);
    Person x3 = new Person("menon", 22);
    Person x4 = new Person("senon", 19);

    Person[] z = {x1,x2,x3,x4};

    Family y1 = new Family(z);

    System.out.println(y1.adults());

    }
    
}
