import javax.lang.model.util.ElementScanner14;

public class fibonacci {
    static int count;
    public static void main(String[] args)
    {
        System.out.println(fib(10));
    }
    public static int fib(int n)
    {
        System.out.println("count:"+(++count)+" fib:"+n);

        if(n==1||n==2)
        {
            
            return 1;
        }else{
          
            return (fib(n-1)+fib(n-2));
        }
    }

}
