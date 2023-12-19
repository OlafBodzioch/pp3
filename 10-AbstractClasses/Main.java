public class Main {
    
    public static void main(String[] args) 
    {
        
        Circle x1 = new Circle(3);
        Rectangle x2 = new Rectangle(2, 4);
        Triangle x3 = new Triangle(5, 3, 5, 4);

        System.out.println("This Circle's area is: "+x1.area()+"\n");
        System.out.println("This Rectangle's area is: "+x2.area()+"\n");
        System.out.println("This Triangle's area is: "+x3.area()+"\n");

        System.out.println("This Circle's circumference is: "+x1.perimeter()+"\n");
        System.out.println("This Rectangle's circumference is: "+x2.perimeter()+"\n");
        System.out.println("This Triangle's circumference is: "+x3.perimeter()+"\n");

    }

}