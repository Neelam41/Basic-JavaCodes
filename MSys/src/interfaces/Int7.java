//7. Create an interface and inherit it from the other interface.
package interfaces;


interface intfA
{
    void A();
}
  
interface intfB extends intfA
{
    void B();
}
  

public class Int7 implements intfB
{
    @Override
    public void A()
    {
        System.out.println("Rohit");
    }
  
    @Override
    public void B()
    {
        System.out.println("Mohit");
    }
  
    public static void main (String[] args)
    {
        Int7 ob1 = new Int7();
        ob1.A();
        ob1.B();
    }
}






