public class Try_Catch_With_Error
{    
    public static void main(String[] args)
    {
        try
        {
            int x =20/0;
        }
        catch(Error e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
    }
}
// Note : error not handle. error is not base class of ArithmeticException
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Try_Catch_With_Error.main(Try_Catch_With_Error.java:7)
