public class Rectangle extends Shape {
    
    private double x;
    private double y;
    
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double area() {

        return this.x * this.y;

    }

    @Override
    public double perimeter() 
    { 
        return this.x*2 + this.y*2;
    }

}
