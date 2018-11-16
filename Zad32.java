
package zad3.pkg2;
import java.io.*;

public class Zad32

{

    
    public static void main(String[] args)
    throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
      
       int n = 10000, a;
       int fib[] = new int[n];
       
       System.out.println("Program pokazuje liczby z ciągu fibonacciego");
       System.out.println("Podaj ile liczb pokazać");
       a = Integer.parseInt(br.readLine());
       
       fib[0] = 1;
       fib[1] = 1;
       
       for (int i =2; i<a; i++)
       {
           fib[i] = fib[i-1] + fib[i-2];
       }
       
       for (int i=0; i<a; i++)
       {
           System.out.println("Number "+(i+1)+": "+fib[i]);
       }
        
    }
    
}
