class ThrowsEx
{
    public static void checkAge() throws ArithmeticException
    {
        int age = 15/0;
    }
    public static void main(String[] args)
    {
        checkAge();
    }
}

