class area
{
    area(float x)
    {
        System.out.println("we are printing area of square:" +x*x);
    }
    area(float b,float l)
    {
        System.out.println("We are printing area of rectangle:"+l*b);
    }
    area(double x )
    {
        double z= 3.14*x*x;
        System.out.println("We are printing area of circle: "+z);

    }
}
public class o_c 
{
    public static void main(String a[])
    {
        area a1 = new area(10.2);
        area a2 = new area(10,8);
        area a3 = new area(9.8);
    }
    
}
