public class StudentTest {
    public static void main(String[] args)
    {

        Student s = new Student();

        s.name = "Olaf";
        s.age = 21;
        s.idCard = 223221;
        s.idIsValid = true;
        s.semesterNumber = 3;
        s.avgGrade = 2.2f;

        Student z = new Student();

        z.name = "Francis";
        z.age = 33;
        z.idCard = 223221;
        z.idIsValid = false;
        z.semesterNumber = 4;
        z.avgGrade = 2.6f;

        Student x = new Student();

        x.name = "York";
        x.age = 22;
        x.idCard = 223221;
        x.idIsValid = false;
        x.semesterNumber = 1;
        x.avgGrade = 4.2f;

        System.out.println(s.name + "\n" + s.age +"\n");

        s.sayHello();
        s.displayName();
        s.displayAge();
        s.displayPartialInfo();
        s.changeIdStatus(s);
        s.displayFullInfo();

        z.sayHello();
        z.displayName();
        z.displayAge();
        z.displayPartialInfo();
        z.changeIdStatus(z);
        z.displayFullInfo();

        x.sayHello();
        x.displayName();
        x.displayAge();
        x.displayPartialInfo();
        x.changeIdStatus(x);
        x.displayFullInfo();
    }
}
