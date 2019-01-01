class Try_Catch_Nested
{  
     public static void main(String args[]){  
     try
     {  
        try
        {  
            int a =39/0;  
            System.out.println("A : "+a);  
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }  
        try
        {  
            int ar[]=new int[5];  
            ar[5]=4;  
            System.out.println("AR  : "+ar[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }       
        System.out.println("Try Execute Successfully");
    }
    catch(Exception e)
    {
        System.out.println("Main Catch : " +e.getMessage());
    }    
        System.out.println("Rest code");  
    }  
}  
