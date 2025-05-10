class student
{
    int number;
    String name;
    

    student()
    {
        System.out.println("DEFAULT constructor is called ");   //default constructor
    }
    student(int r,String n)  // parametrize constructor
    {
        name=n;
        number=r;
    }

    student(student s)  //copy constructor
    {
        name=s.name;
        number=s.number;
    }
        void display()
        {
            System.out.println("We are printing name"+name+"We are printing roll no : "+number);  
        }
    
}
    public class constructor
    {
        public static void main(String a[])
        {   
            student s =new student();
            student s1 = new student(260,"Jaynesh");
            student s2 = new student(s1);
            s1.display();
            s2.display();
        }
    }
