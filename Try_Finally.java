public class Try_Finally
{    
    public static void main(String[] args)
    {
        try
        {
          //  int x = 20/10; // test 1
            int x =20/0; // test 2
            System.out.println("X : "+x);
        }
        catch(Exception e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
        finally
        {
            System.out.println("finally completed");        
        }
    }
}
// Test 1
// X : 2
// finally completed

// Test 2
//Class : class java.lang.ArithmeticException Msg : / by zero
//finally completed
