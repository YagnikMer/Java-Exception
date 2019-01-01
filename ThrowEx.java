class ThrowEx
{
    public static void main(String[] args)
    {
        int age = 15;
        if (age < 18)
        {
            throw new ArithmeticException("Not Valid Age");
        }
        else
        {
            System.out.println("Valid Age");
        }
    }
}

// custom message
//Exception in thread "main" java.lang.ArithmeticException: Not Valid Age
//	at ThrowEx.main(ThrowEx.java:8)


// you can not use exception and throwable class here
//ThrowEx.java:8: error: unreported exception Exception; must be caught or declared to be thrown
  //          throw new Exception("Not Valid Age");
    //        ^
//1 error

