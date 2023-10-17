public class Student {

    String name;
    int age;
    int idCard;
    boolean idIsValid;
    int semesterNumber;
    float avgGrade;


    void sayHello(){
        System.out.println("Hello from "+ name +"\n");
    }

    void displayName(){
        System.out.println("My name is "+ name +"\n");
    }

    void displayAge(){
        System.out.println("I am "+ age +" years old\n");
    }

    void displayPartialInfo(){
        System.out.println(name +"\n"+ semesterNumber +"\n"+ avgGrade +"\n");
    }

    Student changeIdStatus(Student x){
        if(x.idIsValid==false){
            x.idIsValid=true;
            return x;
        }
        else if(x.idIsValid==true){
            x.idIsValid=false;
            return x;
        }else return null;
    }

    void displayFullInfo(){
        System.out.println("Name: "+ name + "\nID Card Number: "+ idCard +"\nIs the ID card valid: "+ idIsValid +"\n");
    }

}
