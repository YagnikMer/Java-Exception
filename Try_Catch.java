public class Try_Catch
{    
    public static void main(String[] args)
    {
        try
        {
            int x =20/0;
        }
        catch(Exception e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
    }
}

//Class : class java.lang.ArithmeticException Msg : / by zero
