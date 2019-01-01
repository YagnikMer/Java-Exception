public class Try_2Catch
{    
    public static void main(String[] args)
    {
        try
        {
            int x =20/0;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("AE : Class : " +ae.getClass() + " Msg : " +ae.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
    }
}

//Note : first sub class specify and then spefify exception class otherwise getting compiler error "already catched"
//AE : Class : class java.lang.ArithmeticException Msg : / by zero
