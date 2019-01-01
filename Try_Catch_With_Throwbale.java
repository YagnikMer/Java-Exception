public class Try_Catch_With_Throwbale
{    
    public static void main(String[] args)
    {
        try
        {
            int x =20/0;
        }
        catch(Throwable e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
    }
}

//Class : class java.lang.ArithmeticException Msg : / by zero
