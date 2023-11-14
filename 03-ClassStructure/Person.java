public class Person {

    String name;
    float weight;
    int height;
    
    public Person(String name, float weight, int height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name)
    {
        this.name = name;
    }

    void setWeightAndHeight(float weight, int height)
    {
        this.weight = weight;
        this.height = height;
    }

    float calculateBMI()
    {
        float h2 = (float)this.height;
        h2 = (h2/100) * (h2/100);
        float result = weight/h2;
        return result;
    }

    void displayName()
    {
        float bmi = this.calculateBMI();
        String isBmiOk;

        if(bmi<18.5)
        {
            isBmiOk = "BMI too low";
        }
        else if (bmi>24.9){
            isBmiOk = "BMI too high";
        }
        else isBmiOk = "BMI is ok";

        String result = "Imię: "+name+"\nWaga: "+Float.toString(weight)+" kg\nWzrost: "+Integer.toString(height)+" cm\n"+isBmiOk+"\n";

        System.out.println(result);
    }




    public static void main(String[] args)
    {
        Person x1 = new Person("qqq",60,180);

        System.out.println(x1.calculateBMI());

        x1.displayName();

        Person x2 = new Person("aqq",60,130);

        System.out.println(x2.calculateBMI());

        x2.displayName();

        Person x3 = new Person("qbq",190,180);

        System.out.println(x3.calculateBMI());

        x3.displayName();

    }

}
