class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
}


public class Custom_Exception2
{    

    public static void checkval() throws MyException
    {
        throw new MyException("Value is wrong");
    }

    public static void main(String[] args)
    {
        try
        {
            checkval();
        }
        catch(MyException e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
    }
}

//Class : class MyException Msg : Value is wrong

