public class SurfaceArea{

    static float calcRectangle(float a, float b){
        return a*b;
    }

    static double calcCircle(double a){
        return a*a*Math.PI;
    }

    static float calcTriangle(float a, float h){
        return a*h/2;
    }

    static float calcCuboid(float l, float w, float h)
    {
        return 2*l*w + 2*w*h + 2*h*l;
    }
    
    static float calcSphere(float a)
    {
        return a*a*4*(float)Math.PI;
    }

    static float calcCone(float r, float h)
    {
        return (float)Math.PI * r * (r + ((float)Math.sqrt((h*h)+(r*r))));
    }

}