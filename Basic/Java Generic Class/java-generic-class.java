//{ Driver Code Starts
//Initial Template for Java

// Java program to illustrate
// Generics
import java.io.*;
import java.util.Scanner;

class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        if(n==1)
        {
            String s=sc.next();
            GenericClass<String> Str=new GenericClass<String>(s);
            Str.showType();
        }
        else
        {
            Integer p=sc.nextInt();
            GenericClass<Integer> integer=new GenericClass<Integer>(p);
            integer.showType();
        }
        }
    }
}

// } Driver Code Ends
//User function Template for Java

public class GenericClass<T> {
    
    //Add your code here. Make a private data variable, constructor which intialize 
    // the data variable and a method showType().
     private T res;
    
    GenericClass(T res)
    {
        this.res = res;
    }
    
    void showType()
    {
        System.out.println(res.getClass().getSimpleName());
        System.out.println(res);
}
}

//{ Driver Code Starts.

// } Driver Code Ends