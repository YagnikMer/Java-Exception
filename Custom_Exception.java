class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
}

public class Custom_Exception
{    
    public static void main(String[] args)
    {
        try
        {
            throw new MyException("Wrong");
        }
        catch(MyException e)
        {
            System.out.println("Class : " +e.getClass() + " Msg : " +e.getMessage());
        }
    }
}

//Class : class MyException Msg : Wrong
