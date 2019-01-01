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
        catch(Exception e)
        {
            System.out.println(e);
        }  
        try
        {  
            int ar[]=new int[5];  
            ar[5]=4;  
            System.out.println("AR  : "+ar[5]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }       
        System.out.println("Try Execute Successfully");
    }
    catch(ArithmeticException e)
    {
        System.out.println("Main Catch : " +e.getMessage());
    }    
        System.out.println("Rest code");  
    }  
}  




// 2 Error
//java.lang.ArithmeticException: / by zero
//java.lang.ArrayIndexOutOfBoundsException: 5
//Try Execute Successfully
//Rest code

