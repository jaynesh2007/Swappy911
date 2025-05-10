class f
{
    final int x=10;
    void display(int x)
    {
    System.out.println("We are printing final value using final keyword "+x);
    }
}
class t
{

}
public class final_this_static 
{
    public static void main(String a[])
    {
        f f1 =new f();
        f1.display(15);

    }    
}
